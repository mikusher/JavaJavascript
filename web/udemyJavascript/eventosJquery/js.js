$(document).ready( function () { 
    console.log('hello JS - Mouse');
    //click
    //dbclick
    //mousedown
    //mouseover

    $('#div1').click(function () { 

        console.log('elemento clicado');
        
    });

 });

 $(document).ready( function () { 
    console.log('hello JS - Teclado');

    //pesquisa pelo ID usando o # ou pela classe usando o ( . )
    $('#username').click(function () { 

        console.log('username clicado');
        
    });

    $('#password').click(function () { 
        
        console.log('password clicado');
                
    });

    $('#entradas').blur(function () { 
        notification();
    });
 
 });

 $( document ).ready(function(){
    
       // Sets up click behavior on all button elements with the alert class
       // that exist in the DOM when the instruction was executed
       $( '.alert' ).on( "click", function() {
           console.log( "A button with the alert class was clicked!" );
       });
    
       // Now create a new button element with the alert class. This button
       // was created after the click listeners were applied above, so it
       // will not have the same click behavior as its peers
       $( "<button class='alert'>Alert!</button>" ).appendTo( document.body );
   });

   $('#myCheckbox').prop('checked', true); // Checks it
   $('#myCheckbox').prop('checked', false); // Unchecks it


$(document).ready(function () {
    $('.campos').change(function () { 
        document.getElementById("username").value = $(".campos option:selected").text(); 
    });

});

$('#news_list').click(function() {
    var ele = $(this).find('input');
    if(ele.is(':checked')){
        ele.removeAttr('checked');
        $(this).removeClass('admin_checked');
    }else{
        ele.attr('checked', 'checked');
        $(this).addClass('admin_checked');
    }
});



 function clickGo(inputU, inputP) {
     var realU = 'luis';
     var realP = 'amilcar';

     if (inputU != realU || inputP != realP) {
         console.log("User ou password errado");
     } else {
        window.location.href = 'toGo.html?'+inputU;
     }
 }

 function clickClean(inputU, inputP) {
    inputU = '';
    inputP = '';
    document.getElementById("username").value = "";
    document.getElementById("password").value = "";

 }

 function nameHello() {
     
     var url = window.location.search;
     var name = url.replace("?", "");
     document.getElementById('helloName').innerHTML = name;

 }

 function notification() {
    var msg = 'Por favor, campo necessario';
    document.getElementById('notificationMenssage').innerHTML = msg;
 }

 function validate(params) {
    var rst = (params == '') ? notification() : document.getElementById('notificationMenssage').innerHTML = '';
 }

 function multipleValidate(paramsU,paramsP) {
    var rst = (paramsU == '' || paramsP  == '') ? notification() : document.getElementById('notificationMenssage').innerHTML = '';
 }