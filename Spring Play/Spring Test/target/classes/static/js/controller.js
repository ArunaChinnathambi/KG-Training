var CharControllers = angular.module("CharControllers", []);

//GET//
CharControllers.controller("ListController", ['$scope', '$http',
    function ($scope, $http) {
        $http.get('/api/characters').success(function (data) {
            $scope.chr = data;
            //console.log($scope.employees);
        });
    }]
);

//POST//
CharControllers.controller("SaveController", ['$scope', '$filter', '$http', '$routeParams', '$location',
    function ($scope, $filter, $http, $routeParams, $location) {
        $scope.title = "Create New Character";
        $scope.save = function () {
         
            var obj = {
            	id: $scope.id,
            	name: $scope.name
            };

           // alert("ADD:::"+JSON.stringify(obj));
            
                $http.post('/api/characters', obj).success(function (data) {
                    $location.path('/list');
                }).error(function (data) {
                    $scope.error = "An error has occured while adding employee! " + data.ExceptionMessage;
                });
        }
    }
]);

//UPDATE//
CharControllers.controller("EditController", ['$scope', '$filter', '$http', '$routeParams', '$location',
    function ($scope, $filter, $http, $routeParams, $location) {

        $scope.id = $routeParams.id; 
        $scope.name = $routeParams.name; 

        $scope.title = "Edit Character";
       /* $http.put('/api/characters/' +$scope.id).success(function (data) {
            $scope.id=data.id;
            $scope.charactername = data.name;
        });*/


        $scope.save = function () {

            var obj = {
               id: $scope.id,
                name: $scope.name,
               
            };


            $http.put('/api/characters/' + $scope.id, obj ).success(function (data) {
                $location.path('/list');
            }).error(function (data) {
                console.log(data);
                $scope.error = "An Error has occured while Saving customer! " + data.ExceptionMessage;
            });
        }
    }
]);


//DELETE//
CharControllers.controller("DeleteController", ['$scope', '$http', '$routeParams', '$location',
        function ($scope, $http, $routeParams, $location) {
	
			$scope.title = "Delete Character";
   
           $scope.id = $routeParams.id;
           /* $http.get('/api/characters/' + $routeParams.id).success(function (data) {
                $scope.charactername = data.name; 
            });*/

            $scope.delete = function () {

                $http.delete('/api/characters/' + $scope.id).success(function (data) {
                    $location.path('/list');
                }).error(function (data) {
                    $scope.error = "An error has occured while deleting student! " + data;
                });
            };
        }
]);
