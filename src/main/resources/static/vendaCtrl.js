angular.module("vendas").controller("vendaCtrl", function($scope, $http) {
	$scope.novoVenda = function(venda) {
		$http.post("venda/novo", venda).success(function(resultadoDoResponse) {
			$scope.venda = resultadoDoResponse;
		});
	};
});
