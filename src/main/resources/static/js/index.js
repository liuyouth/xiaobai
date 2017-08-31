var canvas ;
var ctx ;
$(function(){
    canvas = document.getElementById('ecg1');
    ctx = canvas.getContext('2d');
    //设置对象起始点和终点
    ctx.moveTo(10,10);
    ctx.lineTo(20,20);
    //设置样式
    ctx.lineTo(10,25);


    ctx.lineWidth = 2;
    ctx.strokeStyle = "#F5270B";
    var color = ctx.createLinearGradient(512, 460, 512, 260);
    color.addColorStop(0, '#499989');
    color.addColorStop(1, '#176785');
    ctx.strokeStyle = color;
    ctx.lineTo(50,65);
    //绘制
    ctx.stroke();
});
function loading(){
    //获取上下文
    var canvas = document.getElementById('ecg1');
    var ctx = canvas.getContext('2d');

    //定时器
    var timeClear;
    //定义一些数字
    var arcNum = 0.02,
        textNum = 1;

    function load1(){
        console.log("run")
        if(textNum >= 101){
            return 0;
        }

        ctx.lineWidth = 2;
        ctx.strokeStyle = '#176785';

        ctx.beginPath();
        ctx.arc(512, 360, 100, (0.5 + arcNum - 0.02) * Math.PI, (0.5 + arcNum) * Math.PI);
        ctx.stroke();
        ctx.closePath();

        //绘制里面的渐变颜色
        var color = ctx.createLinearGradient(512, 460, 512, 260);
        color.addColorStop(0, '#499989');
        color.addColorStop(1, '#176785');

        ctx.beginPath();
        ctx.fillStyle = color;
        ctx.arc(512, 360, 99, (0.5 - arcNum/2)* Math.PI, (0.5 + arcNum/2) * Math.PI);
        ctx.fill();
        ctx.closePath();

        //绘制文本
        ctx.font="80px Arial";
        ctx.fillStyle = "#fff";
        ctx.textAlign = "center";
        ctx.beginPath();
        ctx.fillText(textNum, 510, 385 , 124);
        ctx.closePath();
        //ctx.clearRect(0,0,1024,720);


        arcNum = arcNum + 0.02;
        textNum = textNum + 1;

    }

    timeClear = setInterval(load1, 60);
}