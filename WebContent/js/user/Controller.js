application.controller("LoginController",
		function($scope, $http) {
			$scope.loginUser = {};
			$scope.loginUser.userName = null;
			$scope.loginUser.message=null;

			$scope.submitLoginUser = function() {
			alert("haye");
			
//				response=$scope.loginUser.name;
				alert("controller");
				var data = JSON.stringify($scope.loginUser);
				alert(data);
				$scope.loginUser.message=null;
				$http.put(URI+"TradeWork/Login", data).then(function(response) {
					alert(response.data.message);
					if(response.data.userName==$scope.loginUser.userName){
						swal({title:response.data.message,text:"click ok to proceed",type:"success"},
						function(){
							$window.location.href="logged.html";});
						}
					else{
						$scope.loginUser.message=response.data.message;
					}
					
				
					
				}, function(response) {
					alert(response.data.message+" Data ahb");
					
					$scope.loginUser.message = response.data.message;
				
				});

					
				
			};
		});

