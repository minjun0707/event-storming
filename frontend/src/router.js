
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import BookmanagementBookManagementManager from "./components/listers/BookmanagementBookManagementCards"
import BookmanagementBookManagementDetail from "./components/listers/BookmanagementBookManagementDetail"

import BookBookManager from "./components/listers/BookBookCards"
import BookBookDetail from "./components/listers/BookBookDetail"

import UserUserManager from "./components/listers/UserUserCards"
import UserUserDetail from "./components/listers/UserUserDetail"

import NotificationNotificationManager from "./components/listers/NotificationNotificationCards"
import NotificationNotificationDetail from "./components/listers/NotificationNotificationDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/bookmanagements/bookManagements',
                name: 'BookmanagementBookManagementManager',
                component: BookmanagementBookManagementManager
            },
            {
                path: '/bookmanagements/bookManagements/:id',
                name: 'BookmanagementBookManagementDetail',
                component: BookmanagementBookManagementDetail
            },

            {
                path: '/books/books',
                name: 'BookBookManager',
                component: BookBookManager
            },
            {
                path: '/books/books/:id',
                name: 'BookBookDetail',
                component: BookBookDetail
            },

            {
                path: '/users/users',
                name: 'UserUserManager',
                component: UserUserManager
            },
            {
                path: '/users/users/:id',
                name: 'UserUserDetail',
                component: UserUserDetail
            },

            {
                path: '/notifications/notifications',
                name: 'NotificationNotificationManager',
                component: NotificationNotificationManager
            },
            {
                path: '/notifications/notifications/:id',
                name: 'NotificationNotificationDetail',
                component: NotificationNotificationDetail
            },



    ]
})
