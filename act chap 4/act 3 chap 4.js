import React from 'react';

let utilisateur=[{nom:'mohamed tounsi',adresse : 'mohamed-tounsi@gmail.com',numero : '22-555-163'},{nom:'foulen ben foulen',adresse : 'foulen-ben-foulen@gmail.com',numero : '55-555-106'}];
let tt =[utilisateur]
function App(propos){
  return(
      <>{tt.map((Element,index)=><li>{Element.nom + ":" + Element.adresse + ":" + Element.numero}</li>)}</>
  );
}


export default App;
