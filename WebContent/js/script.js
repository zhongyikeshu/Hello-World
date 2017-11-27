var index=0;
	var imgnum=$('.banner ul li').length;
	var nmun='';
	
	// 鼠标悬停在轮播图上，轮播停止，左右方向键出现
	$('.banner').hover(
		function(){clearInterval(p);$('.banner .u').fadeIn();},
		function(){pic();$('.banner .u').fadeOut();});
	// 累加图片数量
	function pic(){
		p=setInterval(
			function(){index++;if(index>=imgnum){index=0;}selectimg(index);},
			2000);
		}
	
	function selectimg(index){
		if($(document).scrollTop()<=120){	
		$('.banner ul li').eq(index).fadeIn(600).siblings().fadeOut(600);
		$('.con a').eq(index).addClass('active').siblings('a').removeClass('active');
		}
	if($(document).scrollTop()>120)
		{clearInterval(p);}
	}
	
	// 点击，图片左移或右移一张
	$('.banner .left').click(function(){
		index-=1;
		if(index<0){
				index=imgnum-1;
			}
		selectimg(index);
		
	});
	
	$('.banner .right').click(function(){
		index+=1;
		if(index>imgnum-1){
				index=0;
			}
		selectimg(index);
		
	});
	
	for(var ni=0;ni<imgnum;ni++){
		nmun +="<a href='javascript:;'></a>";
	}
	$('.banner .con').html(nmun);
	$('.banner .con a').eq(0).addClass('active');
	
	$('.con a').each(function(index){
		$(this).click(function(){
			$('.banner ul li').eq(index).fadeIn(600).siblings().fadeOut(600);
			$(this).addClass('active').siblings('a').removeClass('active');
		});
	});	
	
	pic();