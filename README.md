# Patchy Core – DNS-agnosztikus Init Engine

Patchy egy saját init engine köré épülő biztonsági szolgáltatási keretrendszer, amely systemd nélküli, DNS-agnosztikus működésre optimalizált.  
Elsődlegesen WSL2 + Debian környezetre tervezve, fejlesztői auditálhatóság és komponensszintű modularitás mentén.

## 🎯 Célkitűzés

- Minimalizálni a systemd-alapú infrastruktúra biztonsági kockázatait
- DNS-független szolgáltatáskezelés biztosítása
- Auditálható, naplózható init-folyamatok fejlesztői szinten
- Modularizált komponensstruktúra építése CLI-alapú környezetben

Ez nem disztribúció, nem tutorial, nem közösségi init-rendszer.  
A cél: fejlesztői szintű biztonsági struktúraépítés, nem kompatibilitás vagy tömegfelhasználás.

## ⚙️ Technikai jellemzők

- Saját init engine (systemd-free)
- DNS-agnosztikus szolgáltatáskezelés
- Modularizált komponensstruktúra
- WSL2 + Debian optimalizáció
- CLI-alapú konfiguráció, auditálható naplózás

## 📚 Dokumentáció

A projekt nem tartalmaz automatikus telepítőt vagy tutorialt.  
A komponensek és auditálható folyamatok fejlesztői szinten dokumentáltak.

## 📖 Licenc

Ez a repository nem használható kereskedelmi célra.  
A kód és dokumentáció szabadon tanulmányozható, módosítható, de nem publikálható sajátként, nem oktatási célra újrahasznosítható.  
A fejlesztői szándék: biztonsági struktúraépítés, nem tanítás vagy termékfejlesztés.

## 🔗 Kapcsolódó projektek

- [BeaSQL](https://github.com/BeatrixZselezny/BeaSQL) – strukturált SQL toolkit PostgreSQL-hez
- [sql-memoirs-mentor-edition](https://github.com/BeatrixZselezny/sql-memoirs-mentor-edition) – fejlesztői SQL dokumentáció vizsgaorientált struktúrával
