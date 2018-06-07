//-----------------------REGISTERING THE APPLICATION AND DEPENDENCIES-----------------------

var application = angular.module("Application", [ "ngRoute" ]);

//----------------------CONFIGURING THE APPLICATION------------------------

application.config([ '$routeProvider', function(routeProvider) {
	alert("application");
	
	routeProvider.when('/Login', {
		templateUrl : 'Login.html',
		controller : 'LoginController'
	}).
	otherwise({
		
		redirectTo : '/'
	});
} ]);





//---------------------------------------------------------------------

var URI = getURI();
//------------------------------------------------------