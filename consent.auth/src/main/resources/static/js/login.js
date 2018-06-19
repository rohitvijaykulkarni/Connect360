app.controller('loginCtrl', ['$scope', '$rootScope','$uibModal', '$http',  '$location','$cookies','$cookieStore',function($scope, $rootScope,$uibModal, $http,$location,$cookies,$cookieStore) {
	$rootScope.showNavbar = false;
	$rootScope.viewControlGroupView = 0;
	$scope.sucessMsg="";
	$scope.errorMsg="";
	$rootScope.authenticated = false;
	var TOKEN_KEY = "jwtToken";
	var GROUP_USERNAME = "groupUserName";
	
	// reset login status
    //AuthenticationService.ClearCredentials();
	
	/*$rootScope.getJwtToken = function () {
        return localStorage.getItem(TOKEN_KEY);
        return localStorage.getItem(GROUP_USERNAME);
    }

	$scope.setJwtToken = function (token, username) {
		localStorage.setItem(TOKEN_KEY, token);
		localStorage.setItem(GROUP_USERNAME, username);
    }

	$rootScope.removeJwtToken = function () {
		localStorage.removeItem(TOKEN_KEY);
		localStorage.removeItem(GROUP_USERNAME);
    }*/
	
    $scope.login = function () {
       var data = {
				"username": $scope.username,
	            "password": $scope.password
	        };

    	data = JSON.stringify(data);

    	console.log("deleteGroup JSON object --- "+data);

    	var config = {
            headers : {
                'Content-Type': 'application/json'
            }
        }

    	$http.post("/rest/", data, config)
		   .then(
		       function(response){
		    	   if(response.status==200){
		    		   console.log('in sucess staus 200');
		    		   $rootScope.authenticated = true;
		    		   $rootScope.showNavbar = true;
		    		   //setJwtToken(data.token);
		    		  // $scope.setJwtToken("jwtToken",$scope.username);
		    		   $rootScope.SetCredentials("jwtToken",$scope.username);
		                //showTokenInformation()
		    		   //$scope.showUserInformation(); /// activate this
		    		   $location.path('/');
						
		         }
		         
		         
		       }, 
		       function(response){
		    	  /* open it ..remove below  $scope.errorMsg="Please check the username and password.";
		    	   $rootScope.authenticated = false;*/
		    	   
		    	   console.log('in sucess staus 200');
	    		   $rootScope.authenticated = true;
	    		   //setJwtToken(data.token);
	    		  // $scope.setJwtToken("jwtToken",$scope.username);
	    		   $rootScope.SetCredentials("jwtToken",$scope.username);
	                //showTokenInformation()
	    		   //$scope.showUserInformation(); /// activate this
	    		   $location.path('/');
		      
		       }
		    );
    };//end of login()
    
    
    
    
    
    $rootScope.SetCredentials = function (token, username) {
        //var authdata = Base64.encode(username + ':' + password);
    	$rootScope.currentUserName = username;
    	var authdata = token;
    	
        $rootScope.globals = {
            currentUser: {
                username: username,
                authdata: authdata
            }
        };

        $http.defaults.headers.common['Authorization'] = 'Basic ' + authdata; // jshint ignore:line
        $cookieStore.put('globals', $rootScope.globals);
    };

   
    
    
   /* 
    $scope.createAuthorizationTokenHeader = function () {
    	var token = $scope.getJwtToken();
        if (token) {
            return {"Authorization": token};
        } else {
            return {};
        }
    };//end of createAuthorizationTokenHeader
    
    $scope.showUserInformation = function () {
    	
    	var config = {
	            headers : {
	            	'Content-Type': 'application/json; charset=utf-8',
	            	'Authentication': $scope.createAuthorizationTokenHeader()
	            }
	        };
    	$http.get("/user/", "", config)
		   .then(
				   function(response){
					   //SetCredentials
					   $location.path('/');
			       }, 
			       function(response){
			    	   $scope.errorMsg="Unable to send token or get user info";
			    	   $rootScope.authenticated = false;
			      
			       }
		    );
    	
	    
    };//end of showUserInformation
    
   

    
    $scope.showTokenInformation = function () {
    	$loggedIn
            .text("Token: " + getJwtToken())
            .attr("title", "Token: " + getJwtToken())
            .show();
    };//end of showTokenInformation
    
    */
    
}]);