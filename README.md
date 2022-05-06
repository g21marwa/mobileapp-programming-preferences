
# Rapport

Programmet ska kunna dela preferencer mellan aktiviteter. När man startar programmet
ska man se ett ursprunklig text som det står `still nothing` på se bild 1.
I andra aktiviteten så har vi en EditText där vi kan skriva in ett namn. 
Texten som skrivs in sparas när vi trycker på knappen `setName`. När vi går tillbaka så kan vi se preferensens värde i mainActivity. 
sig av när den får fokus igen se bild 2.

Nedan ser vi hur man skapar en ny preferens
```
SharedPreferences myShared = this.getSharedPreferences(String.valueOf(R.string.myPreferences), Context.MODE_PRIVATE);
SharedPreferences.Editor editor = myShared.edit();
editor.putString(String.valueOf(R.string.mySharedText), "it's working");
editor.apply();
```

Nedan ser vi hur man hämtar en preferens.
```
myShared = getSharedPreferences(String.valueOf(R.string.myPreferences), Context.MODE_PRIVATE);
String myText = myShared.getString(String.valueOf(R.string.mySharedText), "still nothing");
tv.setText(myText);
```

| ![First activity screenshot](ss1.png) | ![second activity screenshot](ss2.png) |
| ------------ | ------------------- |
| Bild 1 | Bild 2 |
