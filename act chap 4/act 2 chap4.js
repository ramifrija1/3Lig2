import React from 'react';
import '/App.css'
let films=[{id:'1',nom:'fausse note'},{id:'2',nom:'lenfant du soleil'},{id:'3',nom:'el jaida'},{id:'4',nom:'dachra'},{id:'5',nom:'porto farina'}];
function App(propos){
  return(
      <>{films.mapp((Element)=><li>{Element.id + ":" + Element.nom}</li>)}</>
  )
}


export default App;
