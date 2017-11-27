window.onscroll=function nav_run() {
	var b=document.documentElement.scrollTop;
	if(b>=110){
		document.getElementById('nav_all').style.position="fixed";
		// document.getElementById('nav_all').style.top="0";
	}
	if(b<=110){
		document.getElementById('nav_all').removeAttribute('style');
		
	}
	// else{
	// 	document.getElementById('nav_nav').style.display="none";
	// }
}