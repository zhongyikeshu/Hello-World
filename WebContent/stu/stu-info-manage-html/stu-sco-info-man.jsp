<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<script src="../../js/jquery-1.11.3.min.js"></script>
	<style type="text/css">
		*{
			margin: 0;
			padding: 0;
		}
		#main-container{
			width: 960px;
    		margin: 0 auto;
    		padding-top: 12px;
    		padding-bottom: 12px;
		}
		#main-box-top{
			width: 960px;
    		height: 5px;
    		background-image: url(../../images/stu-info-manage-img/box_t.png);
		}
		#main-box-middle{
			width: 952px;
    		margin: 0px;
    		padding: 0px;
    		border-right: 4px #eceff1 solid;
    		border-left: 4px #eceff1 solid;
		}
		#main-box-bottom{
			width: 960px;
    		height: 5px;
    		background-image: url(../../images/stu-info-manage-img/box_b.png);
		}
		#center-left{
			width: 151px;
    		float: left;
    		overflow: hidden;
    		padding: 17px 0 20px 0;
		}
		#center-left h3{
			width: 100px;
    		height: 25px;
    		line-height: 20px;
    		padding: 0 0 0 30px;
    		font-size: 14px;
    		margin: 0 auto 0 auto;
    		border-bottom: 1px #bfbfbf dotted;
		}
		#center-left ul{
			list-style: none;
    		margin: 5px 0 0 8px;
    		padding: 0;
		}
		#center-left ul li{
			line-height: 30px;
    		font-size: 14px;
		}
		#center-left ul li a:hover{
			background-image: url(../../images/stu-info-manage-img/smenu.png);
		}
		#center-left ul li a{
			color: #313131;
    		padding-left: 36px;
    		float: left;
    		display: block;
    		width: 108px;
    		margin: 2px 0;
		}
		.headnav1{}
		.headnav2{
			height: 30px;
    		background-image: url(../../images/stu-info-manage-img/smenu.png);
		}
		#center-right{
			float: left;
    		width: 790px;
    		padding-left: 8px;
    		min-height: 200px;
    		font-size: 14px;
    		line-height: 22px;
		}
		.bgwhite{
			background-color: #FFF;
		}
		#sider-le{
			width: 250px;
			height: 320px;
			float: left;
			border-right: 2px solid #9A9A9A;
		}
		#sea-del{
			width: 250px;
			height: 140px;
			float: left;
			/*margin-left: 30px;
			margin-top: 65px;*/
			/*background-color: #666;*/
		}
		#sea-del ul li{
			width: 215px;
			height: 30px;
			text-align: center;
			line-height: 30px;
			margin-top: 10px;
		}
		#add-cha{
			width: 250px;
			height: 160px;
			float: left;
			/*margin-left: 30px;*/
			/*background-color: #666;*/
		}
		#add-cha ul li{
			width: 215px;
			height: 30px;
			text-align: center;
			line-height: 30px;
			margin-top: 10px;
		}
		#sea-res{
			width: 400px;
			height: 250px;
			float: left;
			margin-top: 25px;
			margin-left: 60px;
			/*background-color: #666;*/
		}
		#sea-res ul li{
			width: 65px;
			height: 30px;
			float: left;
			border:1px solid #9A9A9A;
			margin-left: -1px;
			margin-top: -1px;
			text-align: center;
			line-height: 30px;
		}
		input{
			width: 160px;
			height: 25px;
		}
		ul{
			margin:0;
			pading:0;
		}
		ul li{
			list-style: none;
		}
		.sub{
			width: 60px;
			height: 25px;
		}
		.clear{
			margin: 0;
    		height: 0;
    		clear: both;
    		font-size: 0;
    		line-height: 0;
    		overflow: hidden;
		}
	</style>
	<script type="text/javascript">
	function searc(){
		document.getElementById('sedel').action="${pageContext.request.contextPath }/queryScore";
		document.getElementById('sedel').submit();
	}
		function add(){
			document.getElementById('addcha').action="${pageContext.request.contextPath }/add";
			document.getElementById('addcha').submit();
		}
		function delet(){
			var f = confirm("确定要删除吗");
			if(f){
				document.getElementById('sedel').action="${pageContext.request.contextPath }/delete";
				document.getElementById('sedel').submit();
			}
			
		}
		function xiu(){
			/* document.getElementById('addcha').action="${pageContext.request.contextPath }/xiu";
			document.getElementById('addcha').submit(); */
			$.ajax({
				cache: true,
				type: "POST",
				url:  "${pageContext.request.contextPath }/xiu",
				data: $('#addcha').serialize(),// 你的formid
				async: false,
				error: function(request) {
					alert("Connection error");
				},
				success: function(data) {
					alert("修改成功");
					window.location.href="${pageContext.request.contextPath }/stu/stu-info-manage-html/stu-sco-info-man.jsp";
				}
			});
		}
		
		function xiugai(name,className,score){
			$("#addcha input[name=stuName]").val(name);
			$("#addcha input[name=className]").val(className);
			$("#addcha input[name=score]").val(score);
			
		}
		function shanchu(stuId,className){
			$("#sedel input[name=stuId]").val(stuId);
			$("#sedel input[name=className]").val(className);
		}
		
	</script>
</head>
<body>
	<div id="main-container">
			<div id="main-box-top"></div>
			<div id="main-box-middle">
				<div id="center-left">
					<h3>成绩信息管理</h3>
					<ul>
						<li class="headnav2"><a href="javascript:;" onclick="searc()">查询</a></li>
						<li><a href="javascript:;" onclick="add()">添加</a></li>
						<li><a href="javascript:;" onclick="delet()">删除</a></li>
						<li><a href="javascript:;" onclick="xiu()">修改</a></li>
					</ul>
				</div>
				<!-- <script type="text/javascript">
					$("#center-left ul li a").click(function(){
					$(this).parent().addClass("headnav2");
					$(this).parent().siblings().removeClass('headnav2');
					$(this).parent().siblings().addClass('headnav1');
					})
				</script> -->
				<div id="center-right" class="bgwhite">
				<div id="sider-le">
				<!-- 查询删除 -->
					<div id="sea-del">
						<form action="" method="post" id="sedel">
							<ul>
								<li><h4>查询删除</h4></li>
								<li>学&#12288;号:<input type="text" name="stuId"></li>
								<li>课程名:<input type="text" name="className"></li>
							</ul>
						
						</form>
					</div>
					<div style="float: left; width: 250px;height: 0;border:1px solid #9A9A9A;"></div>
				<!-- 添加修改 -->
					<div id="add-cha">
						<form  action="" method="post" id="addcha">
							<ul>
								<li><h4>添加修改</h4></li>
								<li>姓&#12288;名:<input type="text" name="stuName"></li>
								<li>课程名: <input type="text" name="className"></li>
								<li>成&#12288;绩: <input type="text" name="score"></li>
							</ul>
						</form>
					</div>
				</div>
					<!-- 结果 -->
					<div id="sea-res">
						<ul>
							<li>学号</li>
							<li>姓名</li>
							<li>课程名</li>
							<li>成绩</li>
							<li>修改</li>
							<li>删除</li>
						</ul>
						
						
							<c:forEach items="${scoreList }" var="score">
								<ul>
									<li>${score.stuId }</li>
									<li>${score.NAME }</li>
									<li> ${score.className }</li>
									<li>${score.score }</li>
									<li><a href="#" onclick="xiugai('${score.NAME }','${score.className }','${score.score }')">修改</a></li>
									<li><a href="#" onclick="shanchu('${score.stuId }','${score.className }')">删除</a></li>
								</ul>
							</c:forEach>
							
					</div>
					
				</div>
				<div class="clear"></div>
			</div>
			<div id="main-box-bottom"></div>
		</div>
</body>
</html>