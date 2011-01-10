<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.0 Transitional//EN' 'http://www.w3.org/TR/1998/REC-html40-19980424/loose.dtd'> 
<html>
   <head>
     <meta http-equiv='Content-type' content='text/html;charset=UTF-8'/>
      <title>ChemicalTagger</title>
      <link rel='stylesheet' type='text/css' href='res/style-extract.css'/>
      <script type='text/javascript' src='res/jquery-latest.js'></script>
      <script type='text/javascript' src='res/functions.js'></script>
   </head>
   <body>
     <div id='taggedReaction'>
     ${taggedText}
     </div>
     
     <#list checkBoxes?keys?sort as chkBoxName>
            <input type='checkbox' name=${chkBoxName} onclick='checkedAll(${chkBoxName}Form,checked);' ><b>${chkBoxName}</b>:
      <form id ='${chkBoxName}Form'>
      
          
          <#list checkBoxes[chkBoxName] as chkBoxContent>      
                 	  <span name=${chkBoxContent}><input type='checkbox' name='${chkBoxContent}' onClick='highlight("${chkBoxContent}",checked)'>${chkBoxContent}</span>
          
       	</#list>
      </form>

     </#list>
</body>
</html>