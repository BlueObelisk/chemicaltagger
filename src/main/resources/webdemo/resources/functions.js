$(document).ready(function() {
    document.getElementsByName("Actions")[0].checked = true;
    checkedAll(ActionsForm,true);
    
  

  });



 function checkedAll (id,checked) {
     
    for (var i =0; i < id.elements.length; i++) 
    {
     id.elements[i].checked = checked;
     highlight(id.elements[i].name,checked)
    }
      }
      
 function highlight (name,checked) {
         $('span[name="'+name+'"]').each(function () {
            if (checked){
               $(this).addClass(name);}
            else {   
                $(this).removeClass(name);}
    }
   );
   
  
  }