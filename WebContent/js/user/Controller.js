application.controller("LoginController",
		function($scope, $http) {
			$scope.loginUser = {};
			$scope.loginUser.userName = null;
			$scope.loginUser.message=null;

			$scope.submitLoginUser = function() {
			
				alert("controller");
				var data = JSON.stringify($scope.loginUser);
				alert(data);
				alert($scope.loginUser.message="success to api");
				
				$http.put(URI+"/TradeWork/Login", data).then(function(response) {
					alert("inside api"+response.data.message);
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
					alert(response.data.message+" Data ahb");
					
					$scope.loginUser.message = response.data.message;
				
				});

					
				
			};
		});

