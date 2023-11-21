using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerMovement : MonoBehaviour
{

    // Start is called before the first frame update
    void Start()
    {
    }

    // Update is called once per frame
    void Update()
    {

        Transform myTransform = GetComponent<Transform>();
        float h = Input.GetAxisRaw("Horizontal");
        float v = Input.GetAxisRaw("Vertical");
        myTransform.position += new Vector3(h, v, 0).normalized * Time.deltaTime;

        /*if (Input.GetKey(KeyCode.D)) {
            Transform myTransform = GetComponent<Transform>();
            myTransform.position += Vector3.right * Time.deltaTime;
        } else if (Input.GetKey(KeyCode.A)) {
            Transform myTransform = GetComponent<Transform>();
            myTransform.position -= Vector3.right * Time.deltaTime;
        } 

        if (Input.GetKey(KeyCode.W)) {
            Transform myTransform = GetComponent<Transform>();
            myTransform.position += Vector3.up * Time.deltaTime;
        } else if (Input.GetKey(KeyCode.S)) {
            Transform myTransform = GetComponent<Transform>();
            myTransform.position -= Vector3.up * Time.deltaTime;
        } */

    }
}
