import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link } from "react-router-dom";

function BookingDetails({ email }) {
  const [items, setItems] = useState([]);

  const [isLoading, setIsLoading] = useState(true);

  useEffect(() => {
    axios
      .get(
        `http://team2cleanly-env.eba-qkz63mcv.us-east-1.elasticbeanstalk.com/booking/${email}`
      )
      .then((res) => {
        console.log(res.data);
        setItems(res.data);
        setIsLoading(false);
      });
  }, []);

  if (isLoading) {
    return <p>Loading.....</p>;
  } else {
    return (
      <div className="book-body">
        <div className="nav-item">
          <Link to="/">
            <button className="btn btn-info login mb-3">Back to Home Page</button>
          </Link>
        </div>

        {items.map((item) => {
          return (
            <div className="details" key={item.booking_timestamp}>
              <div className="detail-block">
                <span className="detail-head">Type: </span>{" "}
                <span className="detail-body">{item.type}</span>
                <br />
                <span className="detail-head">Frequency: </span>{" "}
                <span className="detail-body">{item.frequency}</span>
                <br />
                <span className="detail-head">Rooms: </span>
                {item.rooms.map((room) => {
                  return (
                    <div className="detail-body" key={room.id}>
                      Room Type:{" "}
                      <span className="body-part">{room.room_type}</span>,
                      Count: <span className="body-part">{room.count}</span>
                    </div>
                  );
                })}
                <br />
                <span className="detail-head">Extras: </span>
                {item.extras.map((extraitem) => {
                  return (
                    <div className="detail-body" key={extraitem.id}>
                      <span className="body-part">{extraitem.extra}</span>
                    </div>
                  );
                })}
                <br />
                <span className="detail-head">Date Booked For: </span>{" "}
                <span className="detail-body">{item.date_booked_for}</span>
                <br />
                <span className="detail-head">Booking Time Period: </span>{" "}
                <span className="detail-body">{item.booking_time_period}</span>
                <br />
                <span className="detail-head">Booking Start Time: </span>{" "}
                <span className="detail-body">{item.booking_start_time}</span>
                <br />
                <span className="detail-head">Special Requirements: </span>{" "}
                <span className="detail-body">{item.special_requirements}</span>
                <br />
                <span className="detail-head">Booking Amount: </span>{" "}
                <span className="detail-body">{item.booking_amount}</span>
                <br />
              </div>
            </div>
          );
        })}
      </div>
    );
  }
}
export default BookingDetails;
