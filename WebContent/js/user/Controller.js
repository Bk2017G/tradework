application.controller("LoginController",
		function($scope, $http) {
			$scope.loginUser = {};
			$scope.loginUser.name = null;

			$scope.submitLoginUser = function() {
			alert("haye");
			
//				response=$scope.loginUser.name;
				
				var data = JSON.stringify($scope.loginUser);
			
				$http.post(URI+"TradeWork/Login", data).then(function(response) {
					alert(response.data.message);
					$scope.loginUser.message = response.data.message;
				
					
				}, function(response) {
					alert(response.data.message+" Data ahb");
					
					$scope.loginUser.message = response.data.message;
				
				});

					
				
			};
		});

