application.controller("LoginController",
		function($scope, $http) {
			$scope.loginUser = {};
			$scope.loginUser.userName = null;
			$scope.loginUser.message=null;

			$scope.submitLoginUser = function() {
				alert("controller");

				var data = JSON.stringify($scope.loginUser);
				alert(data);
				$scope.loginUser.message=null;
				$http.post(URI+"Login",data).then(function(response) {
					alert(response.data.message);
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
					$scope.loginUser.message = response.data.message;
				
				});

					
				
			};
		});

