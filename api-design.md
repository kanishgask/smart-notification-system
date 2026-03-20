# API Design

## Send Notification
POST /notify

{
  "user_id": 1,
  "message": "Your order is shipped",
  "type": "EMAIL",
  "priority": 1
}

## Get Status
GET /status/{id}
