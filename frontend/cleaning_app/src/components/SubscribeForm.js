import React, { Component } from "react";
import axios from "axios";

class SubscribeForm extends Component {
  constructor(props) {
    super(props);

    this.state = {
      email: '',
    };
  }

  changeHandler = e => {
      this.setState({[e.target.name]: e.target.value})
  }

    submitHandler = e => {
        console.log(this.state)
        axios.post('http://localhost:8080/subscribe',this.state)
        .then(res => {
            console.log(res)
        })
        .catch(error => {
            console.log(error)
        })
    }

  render() {
    const { email } = this.state;
    return (
      <div>
        <form className="form-inline" onSubmit={this.submitHandler}>
          <div className="input-group mb-2 mr-sm-2 mb-sm-0">
            <input
              name="email"
              type="email"
              className="form-control subscribe-form"
              id="inlineFormInputGroup"
              placeholder="Enter your email"
              value={email}
              onChange={this.changeHandler}
            />
            <button type="submit" className="input-group-addon subscribe-btn">
              <span className="pe-7s-angle-right"></span>
            </button>
          </div>
        </form>
      </div>
    );
  }
}

export default SubscribeForm;
