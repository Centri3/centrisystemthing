Planet	"Oktdek/Caecus III"
{
	ParentBody     "Oblitus es"
	Class          "Jupiter"
	Mass            317.83
	Radius          71896
	InertiaMoment   0.24219
	OblatenessInfo  0
	RotationPeriod  240
	RotationEpoch   1451545
	Obliquity       2
	EqAscendNode    35.725

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "caecus_oktdek.cfg"
		SurfStyle       0.65237
		Randomize      (-0.626, 0.250, -0.924)
		detailScale     256
		tropicLatitude  0.060812
		icecapLatitude  0.96081
		mareDensity     0
		montesFraction  0
		dunesFraction   0
		hillsFraction   0
		hills2Fraction  0
		canyonsFraction 0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0.076336
		stripeFluct     0.076336
		stripeTwist     1.374
		cycloneMagn     7.9994
		cycloneFreq     0.4581
		cycloneDensity  0.58522
		cycloneOctaves  0
		cycloneMagn2     0.52619
		cycloneFreq2     1.0766
		cycloneLatitude2 0.87683
		cycloneOctaves2  0
		BumpHeight      12.66
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          0.10156
		Velocity        1026
		BumpHeight      4.367
		Gamma           0.6
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  2
		Opacity         0.74809
		mainFreq        1.4656
		mainOctaves     15
		Coverage        0.12474
		stripeZones     0.076336
		stripeFluct     0.076336
		stripeTwist     1.374
	}

	Clouds
	{
		Height          0.10156
		Velocity        2637.9
		BumpHeight      10
		Gamma           0.6
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  2
		mainFreq        1.4656
		mainOctaves     15
		Coverage        0.12474
		stripeZones     0.076336
		stripeFluct     0.076336
		stripeTwist     1.374
	}

	NoLava          true

	Atmosphere
	{
		Model          "Externia"
		Height          250
		Density         10000
		Pressure        1e+06
		Bright          2
		Opacity         0.2
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	90.086
			He        	6.0153
			CH4       	2.7344
			C3H8      	0.31402
			C2H2      	0.30475
			C8H18     	0.30326
			C2H4      	0.11196
			C2H6      	0.053798
			N2        	0.039097
			NH3       	0.028594
			O2        	0.0066862
			Ne        	0.0010999
			Ar        	0.00089637
			CO2       	0.00015371
			H2S       	1.6968e-06
			Kr        	4.0524e-07
			H2O       	2.9388e-07
			Xe        	3.8677e-08
			CO        	3.5634e-08
			SO2       	1.0086e-08
			Cl2       	2.9644e-10
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          38.6270211
		SemiMajorAxis   9.36768566
		Eccentricity    0.05
		Inclination     0.671346435
		AscendingNode   129.160305
		ArgOfPericenter -184.122137
		MeanAnomaly     255.572519
	}
}

