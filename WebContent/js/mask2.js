function opennew2(){
	// 获取页面的高度和宽度
	var sHeight=document.documentElement.scrollHeight;
	var sWidth=document.documentElement.scrollWidth;
	// 可视区域的高度和宽度
	// 如果页面是一个竖向页面，那么可视区域的宽度跟页面宽度一样
	var wHeight=document.documentElement.clientHeight;

	var oMask2=document.createElement("div");
		oMask2.id="mask2";
		oMask2.style.height=sHeight+"px";
		oMask2.style.width=sWidth+"px";
		document.body.appendChild(oMask2);
	var oRegsiter=document.createElement("div");
		oRegsiter.id="regsiter1";
		oRegsiter.innerHTML="<div class='regsiter1con'><div class='regsiter_head'><h4>登录</h4><div id='close' class='glyphicon glyphicon-remove'></div></div><div class='regsiter_con'><input class='regsiter_in1' type='text' name='username'   placeholder='请输入用户名或账号'><input class='regsiter_in2' type='password' name='password' placeholder='请输入密码'><input class='regsiter_in3' type='button' name='regsiter' value='登录'><input class='regsiter_in4' type='button' name='regsiter' value='立即注册'></div></div>"
		document.body.appendChild(oRegsiter);
		// 获取login的高度和宽度
	var dHeight=oRegsiter.offsetHeight;
	var dWidth=oRegsiter.offsetWidth;
		// 给login的left和top赋值
		oRegsiter.style.left=(sWidth-dWidth)/2 +"px";
		oRegsiter.style.top=(wHeight-dHeight)/2 +"px";


		var oClose=document.getElementById("close");
		oMask2.onclick=oClose.onclick=function(){
			document.body.removeChild(oMask2);
			document.body.removeChild(oRegsiter);
		}
		
}
window.onload=function(){
	var oBtn2=document.getElementById("btnRegsiter");
		oBtn2.onclick=function(){
			opennew2();
}
}