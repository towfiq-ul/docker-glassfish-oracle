(function() {
    'use strict';

    angular.module("app")
            .config(function($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise('/home');

        $stateProvider

                .state('home', {
            url: '/home',
            templateUrl: 'app/pages/home/home.html'
        })

                .state('refund-eft/generate-files', {
            url: '/refund-eft/generate-files',
            templateUrl: 'app/pages/refund.eft/generate-files/generate-files.html'
        })
                .state('refund-eft/list-transactions', {
            url: '/refund-eft/list-transactions',
            templateUrl: 'app/pages/refund.eft/list-transactions/list-transactions.html'
        })
                .state('refund-eft/modify-transactions', {
            url: '/refund-eft/modify-transactions',
            templateUrl: 'app/pages/refund.eft/modify-transactions/modify-transactions.html'
        })
               .state('refund-eft/sftp-files', {
            url: '/refund-eft/sftp-files',
            templateUrl: 'app/pages/refund.eft/sftp-files/sftp-files.html'
        })
                .state('refund-eft/refund-history', {
            url: '/refund-eft/refund-history',
            templateUrl: 'app/pages/refund.eft/refund-history/refund-history.html'
        })
                  .state('refund-eft/msf-southeast', {
            url: '/refund-eft/msf-southeast',
            templateUrl: 'app/pages/refund.eft/msf-southeast/msf-southeast.html'
        })       
                  .state('refund-eft/qcash-report', {
            url: '/refund-eft/qcash-report',
            templateUrl: 'app/pages/refund.eft/qcash-report/qcash-report.html'
        })
            .state('refund-eft/schedule-refund', {
                url: '/refund-eft/schedule-refund',
                templateUrl: 'app/pages/refund.eft/schedule-refund/schedule-refund.html'
        })
                .state('user-management', {
            url: '/user-management',
            templateUrl: 'app/pages/user-management/user-management.html'
        })
            .state('error', {
                url: '/error',
                templateUrl: 'app/pages/error/error.html'
            })

    });
})();