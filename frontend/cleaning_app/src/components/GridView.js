
import Heading from './Heading'
import ServiceHead from './ServiceHead';
import React, {useEffect, useState} from 'react'
import axios from 'axios'

function GridView() {

    const [items, setItems] = useState([]);
                const getItems = async() => {
                await axios.get("http://localhost:8080/services")
                .then((res) => {
                    console.log(res.data);
                    setItems(res.data);
                    });
                };

                useEffect(() => getItems(), []);
                items.map(item =>{
                    console.log(typeof item.id)
                })
    return (
        <div>
            {items.map(item => {
                        if(item.id%2 != 0)
                        {
                            return( 
                            <div  className="services" key={item.id}>
                                <div className="service-flex-left"> 
                                    <div className="grid">
                                        <figure className="effect-lily">
                                        <img src={item.service_image_url} className="img-fluid" alt="#" />
                                        </figure>
                                    </div>
                                </div>
                                <div className="service-flex-right">
                                    
                                            <div className="service-link">
                                                <ServiceHead id="service-head" text={item.service_heading} bluetext={item.service_heading_highlighted}></ServiceHead>
                                                <ul>
                                                    {item.service_info.map( service => (
                                                        <li key={service.id}>
                                                            <i className="fa fa-check" aria-hidden="true"></i><a href="#">{service.service_details}</a>
                                                        </li>
                                                    ))}                                               
                                                </ul>
                                            </div>
                                </div>
                            </div> )
                        }
                        else{
                            return(
                            <div className="services" key={item.id}>
                                <div className="service-flex-left">
                                    
                                            <div className="service-link">
                                                <ServiceHead id="service-head" text={item.service_heading} bluetext={item.service_heading_highlighted}></ServiceHead>
                                                <ul>
                                                    {item.service_info.map( service => (
                                                        <li key={service.id}>
                                                            <i className="fa fa-check" aria-hidden="true"></i><a href="#">{service.service_details}</a>
                                                        </li>
                                                    ))}                                               
                                                </ul>
                                            </div>
                                     
                                </div>
                                <div className="service-flex-right"> 
                                    <div className="grid">
                                        <figure className="effect-lily">
                                        <img src={item.service_image_url} className="img-fluid" alt="#" />
                                        </figure>
                                    </div>
                                </div>
                            </div>)
                        }
                    })} 
        </div>
    )
}

export default GridView
