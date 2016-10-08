angular.module("vendas").config(function ($routeProvider) {
	$routeProvider.when("/produto", {
		templateUrl: "produto.html",
		controller: "produtoCtrl"
	});
	$routeProvider.when("/cliente", {
		templateUrl: "cliente.html",
		controller: "clienteCtrl"
	});
	$routeProvider.when("/vendedor", {
		templateUrl: "vendedor.html",
		controller: "vendedorCtrl"
	});
	$routeProvider.when("/venda", {
		templateUrl: "venda.html",
		controller: "vendaCtrl"
	});
	$routeProvider.otherwise({redirectTo: "/produto"});
});