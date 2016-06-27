<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>design starting page</title>
<link rel="stylesheet" type="text/css"
	href="/design/bootstrap/css/bootstrap.css">
<script type="text/javascript" language="javascript"
	src="/design/js/jquery-1.8.3.js"></script>
<script type="text/javascript" language="javascript"
	src="/design/bootstrap/css/bootstrap.js"></script>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		
		var a = 0;
		
		var json = {
				
				"name":"zhangsan"
		};
		
		var name = json.name;
		var name2 = json[name];
		var array = new Array(5){
				1,2,3
		};
		
		for(var i=0;i<array.length;i++){
			
		}
	});
</script>

<body>
	<div class="page-header">
		<div class="container">
			<h1>
        		<small>我是标题<a href="http://www.baidu.com" class="">(我是链接地址点击跳转)</a></small>
   		 	</h1>
   		 	<p>
   		 		我是文本段落，我是文本段落，我是文本段落，我是展示区域。
   		 	</p>
		</div>
   		
	</div>
	<div>
		<div class="col-sm-6 col-md-4" >
			<a href="#" class="thumbnail">我是ul列表标题我已经添加了自定义样式</a>
			<ul class="list-group">
				<li class="list-group-item"><a href="page/factory.jsp" class="">我是列表1工厂方法模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">我是列表2抽象工厂模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">我是列表3单例模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">我是列表4建造者模式</a></li>
				<li class="list-group-item"><a href="page/rule.jsp" class="">我是列表5原型模式</a></li>
			</ul>
		</div>
		<div class="col-sm-6 col-md-4" >
			<a href="#" class="thumbnail">我是table</a>
			<table class="table table-striped table-bordered table-hover dataTable no-footer" id="sample_1" role="grid" aria-describedby="sample_1_info">
							<thead>
								<tr role="row">
									<th class="table-checkbox sorting_disabled" rowspan="1" colspan="1" aria-label="" style="width: 24px;">
										<div class="checker">
											<span><input type="checkbox" class="group-checkable" data-set="#sample_1 .checkboxes">
											</span>
										</div>
									</th>
									<th class="sorting_asc" tabindex="0" aria-controls="sample_1" rowspan="1" colspan="1" aria-sort="ascending" aria-label="
												 Username
											: activate to sort column ascending" style="width: 166px;">
												 Username
									</th>
									<th class="sorting_disabled" rowspan="1" colspan="1" aria-label="
												 Email
											" style="width: 302px;">
												 Email
									</th>
									<th class="sorting_disabled" rowspan="1" colspan="1" aria-label="
												 Points
											" style="width: 96px;">
												 Points
									</th>
									<th class="sorting" tabindex="0" aria-controls="sample_1" rowspan="1" colspan="1" aria-label="oined: activate to sort column ascending" style="width: 155px;">Joined
									</th>
									<th class="sorting_disabled" rowspan="1" colspan="1" aria-label="Status" style="width: 173px;">Status
									</th>
								</tr>
							</thead>
							<tbody>
								<tr class="gradeX odd" role="row">
									<td>
										<div class="checker"><span><input type="checkbox" class="checkboxes" value="1"></span></div>
									</td>
									<td class="sorting_1">
										 coop
									</td>
									<td>
										<a href="mailto:userwow@gmail.com">
										good@gmail.com </a>
									</td>
									<td>
										 20
									</td>
									<td class="center">
										 19.11.2010
									</td>
									<td>
										<span class="label label-sm label-success">
										Approved </span>
									</td>
								</tr>
								<tr class="gradeX even" role="row">
									<td>
										<div class="checker"><span><input type="checkbox" class="checkboxes" value="1"></span></div>
									</td>
									<td class="sorting_1">
										 foopl
									</td>
									<td>
										<a href="mailto:userwow@gmail.com">
										good@gmail.com </a>
									</td>
									<td>
										 20
									</td>
									<td class="center">
										 19.11.2010
									</td>
									<td>
										<span class="label label-sm label-success">
										Approved </span>
									</td>
								</tr>
							</tbody>
						</table>
		</div>
		
	</div>


</body>
</html>
