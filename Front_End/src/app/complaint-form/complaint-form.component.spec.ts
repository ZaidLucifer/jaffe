import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ComplaintFormComponent } from './complaint-form.component';

describe('ComplaintFormComponent', () => {
  let component: ComplaintFormComponent;
  let fixture: ComponentFixture<ComplaintFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ComplaintFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ComplaintFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
