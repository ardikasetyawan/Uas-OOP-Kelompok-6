tokoApp.controller('DaftarController', 
    function($scope, $http, $window, $location) {
        $scope.daftarToko = [];

        $scope.updateDaftar = function() {
            $http.get("/get-home").then(sukses, gagal);

            function sukses(response) {
                $scope.daftarToko = response.data;
            }

            function gagal(response) {}
        };

        $scope.tambah = function() {
            $window.location.href = "/tambah-ui";
            //$location.path('/tambah-ui');
        }

        $scope.edit = function(tokoBuku) {
            $window.location.href = "/edit-ui?id=" + tokoBuku.id +
                    "&judul_buku=" + tokoBuku.judul_buku +
                    "&harga=" + tokoBuku.harga;
        };

        $scope.delete = function(tokoBuku) {
            $http.delete("/api/delete/" + tokoBuku.id).then(sukses, gagal);

            function sukses(response) {
                $scope.updateDaftar();
            }

            function gagal(response) {}
        };

        $scope.updateDaftar();
    }
);