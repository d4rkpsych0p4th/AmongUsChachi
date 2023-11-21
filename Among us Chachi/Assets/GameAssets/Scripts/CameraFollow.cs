using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CameraFollow : MonoBehaviour {
    public Transform target;
    public Vector3 offset = new Vector3(0, 2, -5);

    protected Transform _transform;

    // Start is called before the first frame update
    void Awake()
    {
        _transform = GetComponent<Transform>();   
    }

    // Update is called once per frame
    void LateUpdate()
    {
        _transform.position = target.position + offset;
        _transform.LookAt(target);
    }
}
