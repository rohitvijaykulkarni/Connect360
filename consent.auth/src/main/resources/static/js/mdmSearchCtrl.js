app.controller('mdmSearchCtrl', ['$scope', '$rootScope','$uibModal', '$http',  '$location',function($scope, $rootScope,$uibModal, $http,$location) {
	$rootScope.showNavbar = true;
	$scope.master = [];
	$scope.sucessMsg="";
	$scope.errorMsg="";
	$rootScope.matchScore = "";
	$scope.searchMDM = function(firstName,lastName,ssn,address,city,state,zipCode,dateofBirth,phone){
		var data = {
			    "firstName": firstName,
			    "lastName": lastName,
			    "ssn": ssn,
			    "address": address,
			    "city": city,
			    "state": state,
			    "zipCode": zipCode,
			    "dateofBirth": dateofBirth,
			    "phone": phone
			};

    	data=JSON.stringify(data);

        var config = {
            headers : {
                'Content-Type': 'application/json'
            }
        }

    	console.log("search data is json object ---- "+data);
    	
    	$http.post("/PersonSearch/searchForIdList", data, config)
		   .then(
		       function(response){
		    	   if(response.data.message){
			        	 if(response.data.message=='NO_RECORDS_FOUND'){
			        		 	$scope.errorMsg="No entities found for the given inputs. Please try searching with different inputs.";				          		
			        	 }
			        	 else if(response.data.message=='NO_INPUT'){
			        		 	$scope.errorMsg="Please enter atleast one search field.";				          		
			        	 }
			        	 else if(response.data.message=='LAST_NAME_REQUIRED'){
			        		 	$scope.errorMsg="Please enter last name.";				          		
			        	 }
			        	 else if(response.data.message=='FIRST_NAME_REQUIRED'){
			        		 	$scope.errorMsg="Please enter first name.";				          		
			        	 }
			        	 else if(response.data.message=='CITY_OR_ADDR_REQUIRED'){
			        		 	$scope.errorMsg="Please enter either city or address.";				          		
			        	 }
			        	 
			         }else{
			        	 $scope.sucessMsg="";
			        	 $rootScope.personData = response.data;
			        	 //$location.path('/entityResults');
			         }
		         
		       }, 
		       function(response){
		    	   $scope.errorMsg="Unable to search with given inputs :: Error";
		         
		       }
		    );
	 
	} //end of search
	$scope.reset = function() {
		$scope.sucessMsg="";
		$scope.errorMsg="";
		$scope.personData = [];
        $scope.mdmDetail = angular.copy($scope.master);
    };

  
    $scope.selectPersonCard = function(enterpriseId,score){
    	$rootScope.matchScore = score;
    	console.log($rootScope.matchScore)
		var data = {
			    "enterpriseId": enterpriseId
			};

    	data=JSON.stringify(data);

        var config = {
            headers : {
                'Content-Type': 'application/json'
            }
        }

    	console.log("search data is json object ---- "+data);
    	
    	$http.post("/PersonSearch/getIdEntityListByIdEntityIds", data, config)
		   .then(
		       function(response){
		    	   if(response.data.message){
			        	 if(response.data.message=='NO_RECORDS_FOUND'){
			        		 	$scope.sucessMsg="No entity record found for the given enterpriseId.";										          		
			        	 }
			        	 
			         }else{
			        	 $scope.sucessMsg="";
			        	 $rootScope.personDetailsData = response.data;
			        	 console.log("person data"+$rootScope.matchScore);
			        	 $location.path('/entityDetails');
			         }
		         
		       }, 
		       function(response){
		    	   $scope.errorMsg="Unable to search with given group name:: Error";
		         
		       }
		    );
	 
	}

}]);