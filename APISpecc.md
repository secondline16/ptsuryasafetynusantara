### Login

Request :

- Method : POST
- Endpoint : `/auth/login`
- Header :
  - Content-Type: application/json
  - Accept: application/json
- Body :

```json
{
  "email": "string, unique",
  "password": "string",
  "firebase_token": "string"
}
```

Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data": {
    "id": "integer, unique",
    "name": "string, null",
    "email": "string, unique",
    "phone": "string, nullable",
    "address": "string, nullable",
    "photo": "string",
    "api_token": "string"
  }
}
```

### Register

Request :

- Method : POST
- Endpoint : `/auth/register`
- Header :
  - Content-Type: application/json
  - Accept: application/json
- Body :

```json
{
  "username": "string, unique",
  "password": "string",
  "name": "string, null",
  "email": "string, unique",
  "phone": "string, nullable",
  "address": "string, nullable"
}
```

Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data": null
}
```

### Pengaturan Akun

Request :

- Method : GET
- Endpoint : `/profile/{id}`
- Header :
  - Content-Type: application/json
  - Accept: application/json
  
Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data": {
    "id": "integer, unique",
    "username": "string, nullable",
    "fullname": "string, nullable",
    "email": "string, unique",
    "phone": "string, nullable",
    "address": "string, nullable",
    "photo": "string",
    "api_token": "string"
  }
}
```

### Edit Akun

Request :

- Method : PUT
- Endpoint : `/profile/edit`
- Header :
  - Content-Type: application/json
  - Accept: application/json
- Body :

```json
{
  "username": "string, unique",
  "name": "string, null",
  "phone": "string, nullable",
  "address": "string, nullable"
}
```

Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data": {
    "id": "integer, unique",
    "username": "string, nullable",
    "fullname": "string, null",
    "email": "string, unique",
    "phone": "string, nullable",
    "address": "string, nullable",
    "photo": "string",
    "api_token": "string"
  }
}
```

### Change Password

Request :

- Method : PUT
- Endpoint : `/profile/change_password`
- Header :
  - Content-Type: application/json
  - Accept: application/json
- Body :

```json
{
  "old_password": "string",
  "new_password": "string",
  "confirm_password": "string"
}
```

Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data": {
    "id": "integer, unique",
    "username": "string, nullable",
    "fullname": "string, null",
    "email": "string, unique",
    "phone": "string, nullable",
    "address": "string, nullable",
    "photo": "string",
    "api_token": "string"
  }
}
```

### UPLOAD Avatar PHOTO

Request :

- Method : PUT
- Endpoint : `/profile/avatar/edit`
- Header :
  - Content-Type: application/json
  - Accept: application/json
- Body

```json
{
  "photo": "file, jpg,png"
}
```

Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data": "string, url"
}
```

### List Lowongan Pekerjaan

Request :

- Method : GET
- Endpoint : `/jobs`
- Header :
  - Content-Type: application/json
  - Accept: application/json

Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data": [
      {
        "id": "integer",
        "company_name": "string, nullable",
        "job_position": "string, nullable",
        "deadline": "string, [2020-07-09 23:18:01]"
      },
      {
        "id": "integer",
        "company_name": "string, nullable",
        "job_position": "string, nullable",
        "deadline": "string, [2020-07-09 23:18:01]"
      },
  ]
}
```

### Detail Lowongan Pekerjaan

Request :

- Method : GET
- Endpoint : `/job/{id}`
- Header :
  - Content-Type: application/json
  - Accept: application/json

Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data": {
    "id": "integer",
    "company_name": "string, nullable",
    "job_position": "string, nullable",
    "deadline": "string, [2020-07-09 23:18:01]",
    "description": "string, nullable",
    "requirements": "string, nullable"
}
```

### List Daftar Pelatihan

Request :

- Method : GET
- Endpoint : `/trainings`
- Header :
  - Content-Type: application/json
  - Accept: application/json

Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data": [
      {
        "id": "integer",
        "training_name": "string, nullable",
        "training_start": "string, nullable",
        "training_end": "string, nullable",
        "training_price": "integer, nullable"
      },
      {
        "id": "integer",
        "training_name": "string, nullable",
        "training_start": "string, nullable",
        "training_end": "string, nullable",
        "training_price": "integer, nullable"
      },
  ]
}
```

### Detail Pelatihan

Request :

- Method : GET
- Endpoint : `/training/{id}`
- Header :
  - Content-Type: application/json
  - Accept: application/json

Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data": {
    "id": "integer",
    "training_img": "string, url",
    "training_name": "string, nullable",
    "training_start": "string, nullable [2020-07-09 23:18:01]",
    "training_end": "string, nullable [2020-07-09 23:18:01]",
    "training_price": "integer, nullable",
    "training_desc": "integer, nullable",
    "training_status": "boolean [true=Sudah Pernah daftar pelatihan, false=belum pernah daftar pelatihan]"
    }
}
```

### Form Daftar Pelatihan

Request :

- Method : POST
- Endpoint : `/training/register`
- Header :
  - Content-Type: application/json
  - Accept: application/json
- Body :

```json
{
  "training_id": "integer",
  "customer_id": "integer",
  "invoice_proof": "file"
}
```

Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data": null
}
```

### List Pelatihan Diikuti

Request :

- Method : GET
- Endpoint : `/followup_training` [training_records]
- Header :
  - Content-Type: application/json
  - Accept: application/json

Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data": [
      {
        "id": "integer",
        "training_name": "string, nullable",
        "training_status": "string"
      },
      {
        "id": "integer",
        "training_name": "string, nullable",
        "training_status": "string"
      },
  ]
}
```

### Detail Pelatihan Diikuti

Request :

- Method : GET
- Endpoint : `/training/{training_record_id}`
- Header :
  - Content-Type: application/json
  - Accept: application/json

Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data":
      {
        "id": "integer",
        "training_img": "string, nullable",
        "training_name": "string, nullable",
        "training_desc": "integer, nullable",
        "training_start": "string, nullable",
        "training_end": "string, nullable",
        "trainer_name": "string, nullable",
        "training_status": "string, [Selesai, Belum Selesai]",
        "trainer_cv": "string, url",
        "training_book": "string, url",
        "requirement_status": "string, [Lengkap, Belum Lengkap]",
        "training_certificate": "string, url [pdf]",
        "competence_certificate": "string, url [pdf]"
	"whatsapp_group": "string, nullable"
      },
}
```

### UPLOAD PERSYARATAN

Request :

- Method : POST
- Endpoint : `/training/requirement [upload]`
- Header :
  - Content-Type: application/json
  - Accept: application/json
- Body

```json
{
  "cv": "file, pdf,jpg,png",
  "ktp": "file, pdf,jpg,png",
  "ijazah": "file, pdf,jpg,png",
  "work_experience": "file, pdf,jpg,png",
  "portofolio": "file, pdf,jpg,png",
  "optional_file": "file, pdf,jpg,png [optional]"
}
```

Response :

```json
{
  "meta": {
    "code": "integer",
    "message": "string"
  },
  "data": null
}
```
