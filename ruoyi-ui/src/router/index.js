import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

/* Layout */
import Layout from '@/layout'


// 导航首页
import bookmarkmenu from '@/views/bookmark/menu';

import index3 from '@/views/bookmark/index';
 // import content from '../views/bookmark/content/index';




/**
 * Note: 路由配置项
 *
 * hidden: true                   // 当设置 true 的时候该路由不会再侧边栏出现 如401，login等页面，或者如一些编辑页面/edit/1
 * alwaysShow: true               // 当你一个路由下面的 children 声明的路由大于1个时，自动会变成嵌套的模式--如组件页面
 *                                // 只有一个时，会将那个子路由当做根路由显示在侧边栏--如引导页面
 *                                // 若你想不管路由下面的 children 声明的个数都显示你的根路由
 *                                // 你可以设置 alwaysShow: true，这样它就会忽略之前定义的规则，一直显示根路由
 * redirect: noRedirect           // 当设置 noRedirect 的时候该路由在面包屑导航中不可被点击
 * name:'router-name'             // 设定路由的名字，一定要填写不然使用<keep-alive>时会出现各种问题
 * meta : {
    roles: ['admin','editor']    // 设置该路由进入的权限，支持多个权限叠加
    title: 'title'               // 设置该路由在侧边栏和面包屑中展示的名字
    icon: 'svg-name'             // 设置该路由的图标，对应路径src/icons/svg
    breadcrumb: false            // 如果设置为false，则不会在breadcrumb面包屑中显示
  }
 */
// //书签路由bookmark
// export const bookmark = [
//   {
//     path: '/index2',
//     component: bookmarkmenu,
//     hidden: true
//   },
// ]


// 公共路由
export const constantRoutes = [
  {
    path: '/redirect',
    component: Layout,
    hidden: true,
    children: [
      {
        path: '/redirect/:path(.*)',
        component: (resolve) => require(['@/views/redirect'], resolve)
      }
    ]
  }
  ,{
    path: '/bkuser',
    component: resolve => require(['../views/bookmark/bkuser/index.vue'], resolve),
    hidden: true,
    children:[
      {
        path: '/bkindex',
        component: resolve => require(['../views/bookmark/bkuser/tool/bkindex.vue'], resolve),
        hidden: true,
        meta:{
          title: '个人中心',icon:'user',
          requireAuth: true,//加该字段,表示进入这个路由是需要登录的true
        },
      },
      {
        path: '/importHtml',
        name: 'importHtml',
        component: resolve => require(['../views/bookmark/bkuser/tool/ImportHtml.vue'], resolve),
        hidden: true,
        meta:{
          title: '导入书签',icon:'user',
          requireAuth: true,//加该字段,表示进入这个路由是需要登录的true
        },
      },
      {
        path: '/issueLog',
        name: 'issueLog',
        component: resolve => require(['../views/bookmark/bkuser/tool/issueLog.vue'], resolve),
        hidden: true,
        meta:{
          title: '更新日志',icon:'user',
          requireAuth: true,//加该字段,表示进入这个路由是需要登录的true
        },
      },
      {
        path: '/aboutUs',
        name: 'aboutUs',
        component: resolve => require(['../views/bookmark/bkuser/tool/aboutUs.vue'], resolve),
        hidden: true,
        meta:{
          title: '导入书签',icon:'user',
          requireAuth: true,//加该字段,表示进入这个路由是需要登录的true
        },
      },
      {
        path: '/exportHtml',
        name: 'exportHtml',
        component: resolve => require(['../views/bookmark/bkuser/tool/exportHtml.vue'], resolve),
        hidden: true,
        meta:{
          title: '备份导出',icon:'user',
          requireAuth: true,//加该字段,表示进入这个路由是需要登录的true
        },
      },
      {
        path: '/userSettings',
        name: 'userSettings',
        component: resolve => require(['../views/bookmark/bkuser/tool/userSettings.vue'], resolve),
        hidden: true,
        meta:{
          title: '用户系统设置',icon:'user',
          requireAuth: true,//加该字段,表示进入这个路由是需要登录的true
        },
      }

    ]
  }
  ,{
    path: '/daohang',
    component: resolve => require(['../views/bookmark/menu/index.vue'], resolve),
    hidden: true,
  },
  {
    path: '/login',
    component: (resolve) => require(['@/views/login'], resolve),
    hidden: true
  },
  {
    path: '/404',
    component: (resolve) => require(['@/views/error/404'], resolve),
    hidden: true
  },
  {
    path: '/401',
    component: (resolve) => require(['@/views/error/401'], resolve),
    hidden: true
  },
  {
    path: '',
    component: Layout,
    redirect: 'index',
    children: [
      {
        path: 'index',
        component: (resolve) => require(['@/views/index'], resolve),
        name: '首页',
        meta: { title: '首页', icon: 'dashboard', noCache: true, affix: true }
      }
    ]
  },
  {
    path: '/user',
    component: Layout,
    hidden: true,
    redirect: 'noredirect',
    children: [
      {
        path: 'profile',
        component: (resolve) => require(['@/views/system/user/profile/index'], resolve),
        name: 'Profile',
        meta: { title: '个人中心', icon: 'user' }
      }
    ]
  },
  {
    path: '/dict',
    component: Layout,
    hidden: true,
    children: [
      {
        path: 'type/data/:dictId(\\d+)',
        component: (resolve) => require(['@/views/system/dict/data'], resolve),
        name: 'Data',
        meta: { title: '字典数据', icon: '' }
      }
    ]
  },
  {
    path: '/job',
    component: Layout,
    hidden: true,
    children: [
      {
        path: 'log',
        component: (resolve) => require(['@/views/monitor/job/log'], resolve),
        name: 'JobLog',
        meta: { title: '调度日志' }
      }
    ]
  },
  {
    path: '/gen',
    component: Layout,
    hidden: true,
    children: [
      {
        path: 'edit/:tableId(\\d+)',
        component: (resolve) => require(['@/views/tool/gen/editTable'], resolve),
        name: 'GenEdit',
        meta: { title: '修改生成配置' }
      }
    ]
  },
  // {
  //   path: '/index2',
  //   component: bookmarkmenu,
  //
  // },
  {
    path: '/index3',
    component: index3,
    meta:{
      title: '书签管理',icon:'user',
      requireAuth: false,
    },
    hidden: true,
    children: [
      {
        path: '/content',
        name: 'content',
        component: resolve => require(['../views/bookmark/bookmark/index.vue'], resolve),
        query:{
          t:Date.now(),
        },
        meta:{
          title: '书签页面',icon:'user',
          requireAuth: false,//加该字段,表示进入这个路由是需要登录的true
        },
        children: [
          {
            path: '/nqEdit',
            name: 'nqEdit',
            component: resolve => require(['../views/bookmark/common/nqEdit.vue'], resolve),
            meta:{
              title: 'Quill编辑器',icon:'user',
              requireAuth: true,//加该字段,表示进入这个路由是需要登录的true
            },
          }
        ]
      },{
        path: '/userTagAll',
        name: 'userTagAll',
        component: resolve => require(['../views/bookmark/common/userTagAll.vue'], resolve),
        meta:{
          title: '用户标签',icon:'user',
          requireAuth: true,//加该字段,表示进入这个路由是需要登录的true
        },
      },{
        path: '/ceshi',
        name: 'ceshi',
        component: resolve => require(['../views/bookmark/ceshi/index.vue'], resolve),
        meta:{
          title: '测试页面',icon:'user',
          requireAuth: true,//加该字段,表示进入这个路由是需要登录的true
        },
      },{
        path: '/tool',
        name: 'tool',
        component: resolve => require(['../views/bookmark/common/tool.vue'], resolve),
        meta:{
          title: '工具箱',icon:'user',
          requireAuth: true,//加该字段,表示进入这个路由是需要登录的true
        },
      }
      ,
      {
        path: '/profile',
        name: 'Profile',
        component: (resolve) => require(['@/views/system/user/profile/index'], resolve),
        meta: {
          title: '个人中心', icon: 'user',
          requireAuth: true,
        }
      },
    ],

  },

]

export default new Router({
  mode: 'history', // 去掉url中的#
  scrollBehavior: () => ({ y: 0 }),
  routes:constantRoutes

})

