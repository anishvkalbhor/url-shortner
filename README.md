<p align="center">
  <img src="https://svg-banners.vercel.app/api?type=luminance&text1=Linklytics&width=900&height=180&fontSize=20" alt="Linklytics Banner" />
</p>


<p align="center">
  <b>A powerful and modern URL shortening service with analytics</b><br/>
  Built using <code>React + Spring Boot</code> 🚀
</p>

---

## ✨ Features  

<ul>
  <li>🔒 <b>User Authentication</b>: Secure registration & login with JWT.</li>
  <li>✂️ <b>URL Shortening</b>: Generate short & unique links.</li>
  <li>↔️ <b>Redirection</b>: Fast & reliable redirect to original URL.</li>
  <li>📊 <b>Analytics Dashboard</b>: Manage & view your URLs with insights.</li>
  <li>👆 <b>Click Tracking</b>: Monitor click counts for each link.</li>
  <li>📈 <b>Performance Graphs</b>: Visualize clicks over time with charts.</li>
  <li>📱 <b>Responsive Design</b>: Optimized for mobile & desktop.</li>
  <li>📋 <b>Copy to Clipboard</b>: One-click link copying.</li>
</ul>

## 🛠️ Technologies Used  

<div align="center">

| **Frontend** | **Backend** | **Tools** |
|--------------|-------------|-----------|
| <img src="https://skillicons.dev/icons?i=react" width="50"/> <br> **React** | <img src="https://skillicons.dev/icons?i=java" width="50"/> <br> **Java** | <img src="https://skillicons.dev/icons?i=github" width="50"/> <br> **GitHub** |
| <img src="https://skillicons.dev/icons?i=tailwind" width="50"/> <br> **Tailwind CSS** | <img src="https://skillicons.dev/icons?i=maven" width="50"/> <br> **Maven** | <img src="https://skillicons.dev/icons?i=npm" width="50"/> <br> **NPM** |
| | <img src="https://skillicons.dev/icons?i=postman" width="50"/> <br> **Postman** | <img src="https://skillicons.dev/icons?i=vscode" width="50"/> <br> **VS Code** |
| | <img src="https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens" height="40"/> <br> **JWT** | <img src="https://skillicons.dev/icons?i=idea" width="50"/> <br> **IntelliJ IDEA** |

</div>

## 🚀 Getting Started  

### ✅ Prerequisites  
- ☕ JDK 21+  
- 🔧 Maven  
- 🖥️ Node.js + npm  
- 🐘 PostgreSQL  

### ⚙️ Backend Setup (`url-shortner-sb`)
```sh
cd url-shortner-sb
```

### Edit application.properties:
```sh
spring.datasource.url=<YOUR_POSTGRESQL_URL>
spring.datasource.username=<YOUR_DB_USERNAME>
spring.datasource.password=<YOUR_DB_PASSWORD>
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

jwt.secret=<YOUR_JWT_SECRET_KEY>
jwt.expirationMs=172800000
frontend.url=http://localhost:5173
```

### Run the backend:
```sh
./mvnw spring-boot:run
```

### ➡️ Available at http://localhost:8080

### 🎨 Frontend Setup (url-shortner-frontend)

```sh
cd url-shortner-frontend
npm install
```

### Create .env:
```sh
VITE_BACKEND_URL=http://localhost:8080
VITE_REACT_FRONT_END_URL=http://localhost:5173
```

### Run development server
```sh
npm run dev
```

➡️ Available at http://localhost:5173

### 📂 Project Structure

```sh
anishvkalbhor-url-shortner/
│
├── url-shortner-frontend/   # ⚛️ React Frontend
└── url-shortner-sb/         # ☕ Spring Boot Backend
```

## 🔑 Key Components  

| Module | Description |
|--------|-------------|
| 🧩 **Frontend Components** | `src/components` → Navbar, Dashboard, UI elements |
| 🎣 **Custom Hooks** | `src/hooks` → Data fetching with React Query |
| 🌐 **REST Controllers** | `controller/` → Handles API requests |
| ⚙️ **Business Logic** | `service/` → User management & URL operations |
| 🔐 **Security** | `security/` → Spring Security + JWT config |
| 🗂️ **Entities** | `models/` → JPA entity classes |
| 💾 **Repositories** | `repository/` → Database access with Spring Data JPA |

---

## 🔐 API Endpoints  

<details>
<summary>👤 <b>Authentication</b></summary>

- `POST /api/auth/public/register` → Register new user  
- `POST /api/auth/public/login` → Login & get JWT  

</details>

<details>
<summary>✂️ <b>URL Management</b></summary>

- `POST /api/urls/shorten` → Shorten new URL  
- `GET /api/urls/myurls` → Fetch all user URLs  
- `GET /api/urls/analytics/{shortUrl}` → Analytics for specific URL  
- `GET /api/urls/totalClicks` → Clicks per day  

</details>

<details>
<summary>🔄 <b>Redirection</b></summary>

- `GET /{shortUrl}` → Redirects to original URL  

</details>

---

<h3 align="center">🌟 Developed with ❤️ by Anish 🌟</h3>
