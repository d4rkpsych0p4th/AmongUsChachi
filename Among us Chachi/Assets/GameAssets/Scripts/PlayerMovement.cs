using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Networking;

public class PlayerMovement : NetworkBehaviour
{
    
    [SerializeField]
    private float movementSpeed = 3f;

    protected Transform _transform;
    protected CharacterController controller;
    protected Animator animator;
    protected TaskInteract nearbyTask;

    float horizontal;
    float vertical;

    // Start is called before the first frame update
    void Awake()
    {
        _transform = GetComponent<Transform>();
        controller = GetComponent<CharacterController>();
        animator = GetComponent<Animator>();
    }

    // Update is called once per frame
    void Update() {
        if (isLocalPlayer) {
            Move();
        }
    }

    void Move()
    {
       horizontal = Input.GetAxisRaw("Horizontal");
        vertical = Input.GetAxisRaw("Vertical");
        var movement = new Vector3(h, 0, v).normalized;
        animator.SetFloat("Speed", new Vector2(h, v).magnitude);

        controller.SimpleMove(movement * movementSpeed); // Pide vector de velocidad de movimiento
        //controller.Move(new Vector3(h, 0, v).normalized * movementSpeed * Time.deltaTime); // Pide el vector de desplazamiento
        if (movement.magnitude > 0)
        {
            _transform.forward = Vector3.Slerp(_transform.forward, movement, 0.1f);
        }

        if (Input.GetKeyDown(KeyCode.Space) && nearbyTask)
        {
            // Hacer task
            Debug.Log("Hago tarea");
        }
    }

    private void OnTriggerEnter(Collider other)
    {
        var nearbyTask = other.GetComponent<TaskInteract>();
        if (nearbyTask)
        {
            this.nearbyTask = nearbyTask;
        }
    }

    private void OnTriggerExit(Collider other)
    {
        var nearbyTask = other.GetComponent<TaskInteract>();
        if (nearbyTask)
        {
            this.nearbyTask = null;
        }
    }

    private void OnTriggerStay(Collider other)
    {

    }
}
