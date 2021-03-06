app = angular.module("admin-app", ["ngRoute"]);
app.config(function ($routeProvider){
    $routeProvider
    .when("/product",{
        templateUrl: "/assets/admin/product/index.html",
        controller: "product-ctrl"
    })
    .when("/user",{
        templateUrl: "/assets/admin/user/index.html",
        controller: "user-ctrl"
    })
    .when("/role",{
        templateUrl: "/assets/admin/role/index.html",
        controller: "role-ctrl"
    })
    .when("/authority",{
        templateUrl: "/assets/admin/authority/index.html",
        controller: "authority-ctrl"
    })
    .otherwise({
        templateUrl: "/assets/admin/home.html"
    });
})