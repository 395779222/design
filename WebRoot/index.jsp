<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

    <title>design starting page</title>
    <link rel="stylesheet" type="text/css" href="/design/bootstrap/css/bootstrap.css">
	<script type="text/javascript" language="javascript" src="/design/js/jquery-1.8.3.js"></script>
		<script type="text/javascript" language="javascript" src="/design/bootstrap/css/bootstrap.js"></script>
  </head>
  <script type="text/javascript">
	  $(document).ready(function(){
			var u = navigator.userAgent, app = navigator.appVersion;
			var isAndroid = u.indexOf('Android') > -1 || u.indexOf('Linux') > -1; 
			var isiOS = !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/); 
			testApp("myapp://com.logicsolutions.agelocme");
			/*if (isiOS) { // 来自手机taobao://http://item.taobao.com
				window.location="taobao://item.taobao.com";//打开某手机上的某个app应用
				setTimeout(function(){
					window.location="https://app.logicsolutions.com.cn/agelocme_dev.php";//如果超时就跳转到app下载页
				},5000);
			}
			if(isAndroid){
				testApp("myapp://com.oz/pushDemo/start");
			}*/
		});
		
		function testApp(url) {
					var timeout, t = 1000, hasApp = true;
					setTimeout(function () {
						if (hasApp) {
							return true;
						} else {
							window.location = "https://app.logicsolutions.com.cn/agelocme_dev.php";
						}
						document.body.removeChild(ifr);
					}, 2000)
				
					var t1 = Date.now();
					var ifr = document.createElement("iframe");
					ifr.setAttribute('src', url);
					ifr.setAttribute('style', 'display:none');
					document.body.appendChild(ifr);
					timeout = setTimeout(function () {
						 var t2 = Date.now();
						 if (!t1 || t2 - t1 < t + 100) {
							 hasApp = false;
						 }
					}, t);
		}
  </script>
   
  <body>
   
	<div class="page-header">
		<div class="container">
			<h1>设计模式
        		<small>基本模式3大分类<a href="http://www.baidu.com" class="">(设计原则)</a></small>
   		 	</h1>
   		 	<p>
   		 		邮箱：395779222@qq.com
   		 	</p>
		</div>
   		
	</div>
	<div>
		<div class="col-sm-6 col-md-4" >
			<a href="#" class="thumbnail">创建型模式</a>
			<ul class="list-group">
				<li class="list-group-item"><a href="page/factory.jsp" class="">工厂方法模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">抽象工厂模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">单例模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">建造者模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">原型模式</a></li>
			</ul>
		</div>
		
		<div class="col-sm-6 col-md-4" >
			<a href="#" class="thumbnail">结构型模式</a>
			<ul class="list-group">
				<li class="list-group-item"><a href="page/rule.jsp" class="">适配器模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">装饰器模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">代理模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">外观模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">桥接模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">组合模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">享元模式</a></li>
			</ul>
		</div>
		
		<div class="col-sm-6 col-md-4 " >
			<a href="#" class="thumbnail">行为型模式</a>
			<ul class="list-group">
				<li class="list-group-item"><a href="page/rule.jsp" class="">策略模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">模板方法模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">观察者模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">迭代子模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">责任链模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">命令模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">备忘录模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">状态模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">访问者模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">中介者模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">解释器模式</a></li>
			</ul>
		</div>
		
		
	</div>

  </body>
</html>
