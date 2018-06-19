app.controller('entityDetailsCtrl', ['$scope', '$rootScope','$uibModal', '$http',  '$location',function($scope, $rootScope,$uibModal, $http,$location) {
	$rootScope.showNavbar = true;
	$scope.master = [];
	$scope.IsVisibleSrc2 = false;
	 $scope.IsVisibleSrc3 = false;
	 $scope.IsVisibleSrc4 = false;
   $scope.ShowHideSrc1 = function (){
       //If DIV is visible it will be hidden and vice versa.
       $scope.IsVisible = $scope.IsVisible ? false : true;
   }
   $scope.ShowHideSrc2 = function (){
       //If DIV is visible it will be hidden and vice versa.
       $scope.IsVisibleSrc2 = $scope.IsVisibleSrc2 ? false : true;
   }
   $scope.ShowHideSrc3 = function (){
       //If DIV is visible it will be hidden and vice versa.
       $scope.IsVisibleSrc3 = $scope.IsVisibleSrc3 ? false : true;
   }
   $scope.ShowHideSrc4 = function (){
       //If DIV is visible it will be hidden and vice versa.
       $scope.IsVisibleSrc4 = $scope.IsVisibleSrc4 ? false : true;
   	
   }
	
  $scope.viewMemberDetails = function(memIdnum,srcCode){
	  var data = {
			  	"memIdnum": memIdnum,
		        "srcCode": srcCode
	        };

	    	data=JSON.stringify(data);

	        var config = {
	            headers : {
	                'Content-Type': 'application/json'
	            }
	        }

	    	console.log("search data is json object ---- "+data);
	    	
	    	$http.post("/PersonSearch/getClientList", data, config)
			   .then(
			       function(response){
			    	   if(response.data.message){
				        	 if(response.data.message=='NO Group Found.'){
				        		 	$scope.sucessMsg="No Control Group with this name exists. Please try searching with other name.";
					          		
				        	 }
				        	 
				         }else{
				        	 $scope.sucessMsg="";
				        	 $rootScope.memDetailsData = response.data;
				        	 $location.path('/memberDetails');
				         }
			         
			       }, 
			       function(response){
			    	   $scope.errorMsg="Unable to search with given group name:: Error";
			         
			       }
			    );
		 
	  
  }


}]);