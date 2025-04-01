const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm58ip7/",
            name: "ssm58ip7",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm58ip7/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "汽车售票网站设计"
        } 
    }
}
export default base
