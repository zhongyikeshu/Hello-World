<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>学生成绩信息管理系统</title>
	<link rel="shortcut icon" href="../../images/890.ico">
	<script src="../../js/jquery-1.11.3.min.js"></script>
	<style type="text/css">
		*{
			margin: 0;
			padding: 0;
		}
		#header{
			height: 128px;
			background: url(../../images/stu-info-manage-img/header_bg.jpg);
		}
		#headtop{
			width: 960px;
			height: 86px;
			margin: 0 auto;
		}
		#logo{
			width: 400px;
			height: 85px;
			float: left;
			color: #014D71;
			font:700 22px/85px "微软雅黑";
		}
		#logonstats{
			float: right;
    		color: #333;
    		margin: 10px 10px 0 0;
    		font-size: 12px;
    		line-height: 14px;
		}
		#logonstats a{
			text-decoration: none;
    		color: #333;
		}
		#headmenu{
			width: 960px;
    		height: 41px;
    		margin: 1px auto;
		}
		#headmenu ul{
			margin: 0;
    		padding: 0;
    		list-style: none;
		}
		#headmenu ul li{
			height: 41px;
    		text-align: center;
    		width: 120px;
    		color: white;
    		font-weight: 700;
    		line-height: 41px;
    		font-size: 14px;
    		float: left;
    		margin-right: 10px;
		}
		#headmenu a{
			color: white;
    		text-decoration: none;
    		height: 41px;
    		width: 120px;
    		display: block;
		}
		#headmenu ul li a:hover{
			height: 41px;
    		background-image: url(../../images/stu-info-manage-img/MenuBg.jpg);
		}
		.headnav1{}
		.headnav2{
			height: 41px;
    		background-image: url(../../images/stu-info-manage-img/MenuBg.jpg);
		}
		#main{
			background-image: url(../../images/stu-info-manage-img/wrapper_bg.jpg);
    		background-repeat: repeat-x;
		}
		#iframe-wrap{
			width: 980px;
			height: 400px;
    		margin: 0 auto;
		}
		#iframe-wrap iframe{
			width: 980px;
			height: 400px;
		}
	</style>
	
</head>
<body>
	<div id="header">
		<div id="headtop">
			<div id="logo">学生成绩信息管理系统</div>
			<div id="logonstats">
				<span id="head-username">欢迎您，某某</span>&nbsp;。
				<a id="head-logout" href="#">注销登录</a>
			</div>
		</div>
		<div id="headmenu">
			<ul>
				<li class="headnav2"><a href="user-manage.jsp" target="iframe-a">用户管理</a></li>
				<li><a href="stu-bas-info-man.jsp" target="iframe-a">学生信息管理</a></li>
				<li><a href="cou-info-man.jsp" target="iframe-a">课程信息管理</a></li>
				<li><a href="${pageContext.request.contextPath }/queryScore" target="iframe-a">成绩信息管理</a></li>
				<li><a href="data-cou.jsp" target="iframe-a">数据统计</a></li>
			</ul>
		</div>
	</div>
	<script type="text/javascript">
		$("#headmenu ul li a").click(function(){
			$(this).parent().addClass("headnav2");
			$(this).parent().siblings().removeClass('headnav2');
			$(this).parent().siblings().addClass('headnav1');
		})
	</script>
	<div id="main">
		<div id="iframe-wrap">
			<iframe src="user-manage.jsp" frameborder="0" scrolling="0" name="iframe-a"></iframe>
		</div>
	</div>
</body>
</html>