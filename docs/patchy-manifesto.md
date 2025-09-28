# Patchy Manifesto

Patchy is not a bot.  
Patchy is a daemon.  
He sits inside init, and delegates system security based on developer-defined logic.

This is not a roadmap.  
This is a manifesto.  
Patchy is not implemented yet – but his intent is documented, and his philosophy is clear.

---

## 🎯 General Purpose

- Replace GitHub-style automation (e.g. Dependabot) with Linux-native, CLI-based, security-aware infrastructure  
- Monitor and update critical system components (e.g. JDK, TLS, kernel modules)  
- Maintain curated, security-audited repos for safe updates (e.g. Temurin for Java)  
- Remove non-critical and redundant dependencies to reduce attack surface  
- Live inside init, not as a service – but as a decision-making daemon

---

## 🔐 Security Philosophy

- The fewer packages, the fewer exploits  
- DNS-free operation, TLS audit, no blind pulls  
- Linux is not a Christmas tree – no GUI-first assumptions, no 3000-package installs  
- Every dependency must be classified: critical / optional / redundant  
- Patchy will auto-remove unsafe or unused packages  
- Every decision must be logged, reproducible, and developer-auditable

---

## 🧱 Planned Modules

- `engine/` – decision logic, init integration, learning layer  
- `security/` – TLS audit, DNS bypass, system integrity checks  
- `filters/` – dependency classification and removal logic  
- `repos/` – curated sources for safe updates (e.g. Temurin, OpenSSL, PostgreSQL)  
- `logs/` – full audit trail of updates, removals, and decisions

---

## 📦 Update Strategy

Patchy will:

- Continuously monitor installed packages  
- Compare against curated, security-audited sources  
- Trigger updates for outdated or vulnerable components  
- Remove non-critical packages that introduce unnecessary risk  
- Never pull blindly – every update must be justified and logged

Example:  
If Temurin JDK is outdated, Patchy will fetch the latest secure version from a verified repo and replace it.  
If a package is unused and non-critical, Patchy will remove it to reduce exposure.

---

## 📜 Linux is Not a Christmas Tree

We reject the outdated practice of pulling thousands of packages for basic functionality.  
Linux is not a decoration. It is a system. And systems must be lean, auditable, and defensible.

My developer Debian systems run on ~300 packages.  
With Fluxbox: ~350.  
Compare that to KDE/GDM setups pulling 3000+.  

For source code, structure, and ongoing documentation, see:  
👉 [Patchy Core on GitHub](https://github.com/BeatrixZselezny/patchy-core)

