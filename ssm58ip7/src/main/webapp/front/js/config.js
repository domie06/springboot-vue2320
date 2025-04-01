
var projectName = '汽车售票网站设计';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '客运班次',
	url: './pages/keyunbanci/list.html'
}, 

{
	name: '新闻资讯',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm58ip7/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"客户","menuJump":"列表","tableName":"kehu"}],"menu":"客户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"班次类型","menuJump":"列表","tableName":"bancileixing"}],"menu":"班次类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"客运班次","menuJump":"列表","tableName":"keyunbanci"}],"menu":"客运班次管理"},{"child":[{"buttons":["查看","新增","修改","删除","审核"],"menu":"购票记录","menuJump":"列表","tableName":"goupiaojilu"}],"menu":"购票记录管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"会员","menuJump":"列表","tableName":"huiyuan"}],"menu":"会员管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"会员充值","menuJump":"列表","tableName":"huiyuanchongzhi"}],"menu":"会员充值管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"会员等级","menuJump":"列表","tableName":"huiyuandengji"}],"menu":"会员等级管理"},{"child":[{"buttons":["查看","修改","删除","新增","审核"],"menu":"会员购票记录","menuJump":"列表","tableName":"huiyuangoupiaojilu"}],"menu":"会员购票记录管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"新闻资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"客服中心","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","购票","会员购票"],"menu":"客运班次列表","menuJump":"列表","tableName":"keyunbanci"}],"menu":"客运班次模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","购票"],"menu":"客运班次","menuJump":"列表","tableName":"keyunbanci"}],"menu":"客运班次管理"},{"child":[{"buttons":["查看","支付"],"menu":"购票记录","menuJump":"列表","tableName":"goupiaojilu"}],"menu":"购票记录管理"},{"child":[{"buttons":["查看","新增","支付"],"menu":"会员充值","menuJump":"列表","tableName":"huiyuanchongzhi"}],"menu":"会员充值管理"},{"child":[{"buttons":["查看"],"menu":"会员等级","menuJump":"列表","tableName":"huiyuandengji"}],"menu":"会员等级管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","购票","会员购票"],"menu":"客运班次列表","menuJump":"列表","tableName":"keyunbanci"}],"menu":"客运班次模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"客户","tableName":"kehu"},{"backMenu":[{"child":[{"buttons":["查看","会员购票"],"menu":"客运班次","menuJump":"列表","tableName":"keyunbanci"}],"menu":"客运班次管理"},{"child":[{"buttons":["查看"],"menu":"会员等级","menuJump":"列表","tableName":"huiyuandengji"}],"menu":"会员等级管理"},{"child":[{"buttons":["查看","支付"],"menu":"会员购票记录","menuJump":"列表","tableName":"huiyuangoupiaojilu"}],"menu":"会员购票记录管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","购票","会员购票"],"menu":"客运班次列表","menuJump":"列表","tableName":"keyunbanci"}],"menu":"客运班次模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"会员","tableName":"huiyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
