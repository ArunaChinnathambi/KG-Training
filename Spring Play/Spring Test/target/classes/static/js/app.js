var CharApp = angular.module('ChrApp', [
    'ngRoute',
    'CharControllers'
]);

CharApp.config(['$routeProvider', function ($routeProvider) {

    $routeProvider.when('/list', {
        templateUrl: 'Character/list.html',
        controller: 'ListController'
    }).
    when('/create', {
        templateUrl: 'Character/create.html',
        controller: 'SaveController'
    }).
    when('/edit/:id', {
        templateUrl: 'Character/edit.html',
        controller: 'EditController'
    }).
    when('/delete/:id', {
        templateUrl: 'Character/delete.html',
        controller: 'DeleteController'
    }).
    otherwise({
        redirectTo: '/list'
    });

}]);