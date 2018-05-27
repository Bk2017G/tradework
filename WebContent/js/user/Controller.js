application.controller("LoginController",
		function($scope, $http) {
			$scope.loginUser = {};
			$scope.loginUser.name = null;
			
			$scope.submitLoginUser = function() {
			
				
				if($scope.isLoginNameValid==1)
					{
				
					response=$scope.loginUser.name;
				
				var data = JSON.stringify($scope.loginUser);
			
				$http.post(URI+"User/Login", data).then(function(response) {
					
					$scope.loginUser.message = response.data.message;
				
					
				}, function(response) {
					
					$scope.loginUser.message = response.data.message;
				
				});
					}
				else
					{
					$scope.loginUser.message ="Wrong NAME"
					
					}
					
					
				
			};
		});

