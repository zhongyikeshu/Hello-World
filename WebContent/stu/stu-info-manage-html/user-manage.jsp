<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
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
		#center-left ul li .on{
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
		.clear{
			margin: 0;
    		height: 0;
    		clear: both;
    		font-size: 0;
    		line-height: 0;
    		overflow: hidden;
		}
	</style>
</head>
<body>
	<div id="main-container">
			<div id="main-box-top"></div>
			<div id="main-box-middle">
				<div id="center-left">
					<h3>用户管理</h3>
					<ul>
						<li><a href="" class="on">添加用户</a></li>
						<li><a href="">修改密码</a></li>
					</ul>
				</div>
				<div id="center-right" class="bgwhite"></div>
				<div class="clear"></div>
			</div>
			<div id="main-box-bottom"></div>
		</div>
</body>
</html>