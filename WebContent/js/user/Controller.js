application.controller("LoginController",
		function($scope, $http) {
			$scope.loginUser = {};
			$scope.loginUser.userName = null;
			$scope.loginUser.message=null;

			$scope.submitLoginUser = function() {
<<<<<<< HEAD

				var data = JSON.stringify($scope.loginUser);
//				alert(data);
				alert(URI+"Login");
				
				$http.put(URI+"Login", data).then(function(response) {
					alert("inside api"+response.data.message);
=======
			
//				response=$scope.loginUser.name;
				alert("controller");
				var data = JSON.stringify($scope.loginUser);
				alert(data);
				$scope.loginUser.message=null;
				$http.post(URI+"Login",data).then(function(response) {
					alert(response.data.message);
>>>>>>> Develop
					if(response.data.userName==$scope.loginUser.userName){
						swal({title:response.data.message,text:"click ok to proceed",type:"success"},
						function(){
							$window.location.href="logged.html";});
						}
					else{
						alert("inside else");
						$scope.loginUser.message=response.data.message;
					}
					
				
					
				}, function(response) {
<<<<<<< HEAD
					alert(response.data.message+" Data");
=======
>>>>>>> Develop
					
					$scope.loginUser.message = response.data.message;
				
				});

					
				
			};
		});

