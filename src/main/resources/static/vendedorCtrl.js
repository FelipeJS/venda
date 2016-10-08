angular.module("vendas").controller("vendedorCtrl", function ($scope, $http) {
		$scope.novoVendedor = function (vendedor) {
			$http.post("vendedor/novo", vendedor).success(function (resultadoDoResponse) {
				$scope.vendedor = resultadoDoResponse;
			});
		};		
	});
