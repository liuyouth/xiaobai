var canvas ;
var ctx ;
var fYList=[];
var freeState = 0;
// 每隔50ms 新建一个变量加入数组，
// 如果是正在进行，则把累加变量加入，
// 下一次还在进行再累加，
// 如果完结在处理就累减，同上累减。
// 如果什么都没做就50
// 如果总量到了规定显示最大就把最开始那个剔除，

//涉及到 具体不同的业务需要 折线图的变换结构也会有所不同。会根据数据进行绘制
$(function(){
    canvas = document.getElementById('ecg1');
    ctx = canvas.getContext('2d');
    // //设置对象起始点和终点
    // ctx.moveTo(10,10);
    // ctx.lineTo(20,20);
    // //设置样式
    // ctx.lineTo(10,25);
    // ctx.lineWidth = 2;
    // ctx.strokeStyle = "#F5270B";
    // var color = ctx.createLinearGradient(512, 460, 512, 260);
    // color.addColorStop(0, '#499989');
    // color.addColorStop(1, '#176785');
    // ctx.strokeStyle = color;
    // ctx.lineTo(50,65);
    // //绘制
    // ctx.stroke();
    timer();
    loading();
});
function netText() {
    var clearAdd;
    var clearReduce;
    var clearDefult;
    function add() {
        if (freeState == 1){
            clearReduce = setInterval(reduce, 100);
            clearInterval(clearAdd);
        }
        freeState = 1;
        return;
    }
    function reduce() {
        if (freeState==2) {
            clearDefult = setInterval(defult, 500);
            clearInterval(clearReduce);
        }
        freeState = 2;
        return;
    }
    function defult() {
        if (freeState==0){
            clearInterval(clearDefult);
            clearAdd = setInterval(add, 300);
        }
        freeState = 0;
        return;
    }
    clearAdd = setInterval(add, 300);

}
function timer() {
    //定时器
    var timeClear;
    var defultCount = 50;
    var addCount = 50;
    var reduceCount = 50;
    function runY() {
        if(fYList.length>200){
            fYList.splice(0,1)
        }
        switchState(freeState);

    }

    function switchState(state) {
        switch (state){
            case 0:
                fYList.push(defultCount)
                break;
            case 1:
                addCount = addCount+1;
                fYList.push(addCount)
                reduceCount = defultCount;
                break;
            case 2:
                addCount = addCount - 1;
                fYList.push(addCount)
                addCount = defultCount;
                break;
        }
        console.log("size "+fYList.length)
    }
    timeClear = setInterval(runY, 50);
}
function loading(){
    //获取上下文
    // var canvas = document.getElementById('ecg1');
    // var ctx = canvas.getContext('2d');

    //定时器
    var timeClear;
    //定义一些数字
    var arcNum = 0.02,
        textNum = 1;

    function load1(){
        console.log("load 开始"+new Date())
        // if(textNum >= 101){
        //     return 0;
        // }

        ctx.lineWidth = 2;
        //ctx.strokeStyle = '#176785';
        //
        // ctx.beginPath();
        // ctx.arc(512, 360, 100, (0.5 + arcNum - 0.02) * Math.PI, (0.5 + arcNum) * Math.PI);
        // ctx.stroke();
        // ctx.closePath();
        //
        // //绘制里面的渐变颜色
        // var color = ctx.createLinearGradient(512, 460, 512, 260);
        // color.addColorStop(0, '#499989');
        // color.addColorStop(1, '#176785');
        //
        // ctx.beginPath();
        // ctx.fillStyle = color;
        // ctx.arc(512, 360, 99, (0.5 - arcNum/2)* Math.PI, (0.5 + arcNum/2) * Math.PI);
        // ctx.fill();
        // ctx.closePath();
        //
        // //绘制文本
        // ctx.font="80px Arial";
        // ctx.fillStyle = "#fff";
        // ctx.textAlign = "center";
        // ctx.beginPath();
        // ctx.fillText(textNum, 510, 385 , 124);
        // ctx.closePath();
        // //ctx.clearRect(0,0,1024,720);
        //
        //
        // arcNum = arcNum + 0.02;
        // textNum = textNum + 1;
        var color = ctx.createLinearGradient(512, 460, 512, 260);
        color.addColorStop(0, '#499989');
        color.addColorStop(1, '#176785');
        ctx.strokeStyle = color;
        ctx.beginPath();

        for (var i=fYList.length;i>0;i--)
        {
            ctx.lineTo(i,fYList[i]);
            console.log(i)
        }

        //绘制
        ctx.clearRect(0,0,canvas.width,canvas.height);
        ctx.stroke();
        console.log("load 结束"+new Date())
    }

    timeClear = setInterval(load1, 50);

}