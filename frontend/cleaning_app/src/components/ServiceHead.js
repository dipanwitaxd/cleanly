import React from 'react'

function ServiceHead({text, bluetext}) {
    return (
        <div>
            <h2>
                {text + " "}
                <span className="bluetext">{bluetext}</span>
            </h2>
               
        </div>
    )
}

export default ServiceHead
