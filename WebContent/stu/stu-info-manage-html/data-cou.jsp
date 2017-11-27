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
		ul li{
			list-style: none;
			width: 240px;
			height: 25px;
			margin-top: 9px;
		}
		/*form{
			display: inline-block;
			width: 400px;
			height: 160px;
			margin-left: 20px;
			margin-top: 10px;
			margin:0;
			padding:0;
		}*/
		input{
			width: 160px;
			height: 25px;
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
		#center-top{
			width: 900px;
			height: 180px;
    		
		}
		#ct-left{
			width: 440px;
			height: 180px;
			float: left;
		}
		#ct-right{
			width: 440px;
			height: 180px;
			float: left;
		}
		#center-bottom{
    		width: 900px;
    		height: 180px;
		}
		#cb-left{
			width: 440px;
			height: 180px;
			float: left;
		}
		#cb-right{
			width: 440px;
			height: 180px;
			float: left;
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

				<div id="center-top">
					<div id="ct-left">
						<h4>按学生</h4>
						<form action="${pageContext.request.contextPath }/countByStu" method="post" style="margin-left: 30px;">
							<ul>
									<li style="margin-top: 24px;">学&#12288;号 <input type="text" name="stuId"></li>
									<li style="margin-top: 15px;">姓&#12288;名 <input type="text" name="name"></li>
									<li style="margin-left: 52px;margin-top: 19px;"><input type="submit" name="" value="查询"></li>
								</ul>
						</form>
					</div>
					<div id="ct-right">
						<form action="${pageContext.request.contextPath }/submitTotalScore" method="post">
							<input type="hidden" name="stuId" value="${stuId}">	
							<ul>
								<li>总&#8194;成&#8194;绩 <input type="text" name="totalScore" value="${total[0].totalScore }"></li>
								<li>最高成绩 <input type="text" name="" value="${total[0].maxScore }"></li>
								<li>最低成绩 <input type="text" name="" value="${total[0].minScore }"></li>
								<li>平均成绩 <input type="text" name="avgScore" value="${total[0].totalScore/total[0].totalClass }"></li>
								<li style="margin-left: 69px;"><input type="submit" name="" value="总成绩添加至学生表"></li>
							</ul>
						</form>
					</div>
				</div>

				<hr>

				<div id="center-bottom">
					<div id="cb-left"	>
						<h4>按课程</h4>
						<form action="countByClass" method="post" style="margin-left: 30px;">
							<ul>
								<li style="margin-top: 24px;">课程名 <input type="text" name="className"></li>
								<li style="margin-left: 52px;margin-top: 20px;"><input type="submit" name="" value="查询"></li>
							</ul>
						</form>
					</div>
					<div id="cb-right">
						<form action="${pageContext.request.contextPath }/submitClassinfo" method="post">
							<ul>
								<li>最高成绩 <input type="text" name="" value="${list[0].maxScore }"></li>
								<li>最低成绩 <input type="text" name="" value="${list[0].minScore }"></li>
								<li>平均成绩 <input type="text" name="avgScore" value="${list[0].totalScore/list[0].totalStu }"></li>
								<li>选课人数 <input type="text" name="" value="${list[0].totalStu }"></li>
								<li style="margin-left: 69px;"><input type="submit" name="" value="选课人数添加至课程表"></li>
							</ul>
						</form>
					</div>
				</div>
				<div class="clear"></div>
			</div>
			<div id="main-box-bottom"></div>
		</div>
</body>
</html>