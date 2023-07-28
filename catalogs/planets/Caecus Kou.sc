Planet	"Kou/Caecus I"
{
	ParentBody     "Oblitus es"
	Class          "Ferria"
	Mass            0.32
	Radius          3446
	InertiaMoment   0.32895
	Obliquity       0.1
	EqAscendNode    -35.725
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.643 0.551 0.378)

	Interior
	{
		Composition
		{
			Metals		100
		}
	}

	Surface
	{
		Preset         "caecus_kou.cfg"
		SurfStyle       0.99229
		Randomize      (1.328, 1.634, 1.267)
		colorDistMagn   0.063817
		colorDistFreq   368.39
		detailScale     128
		drivenDarkening 0.37405
		seaLevel        -0.19847
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.76336
		icecapHeight    0.035154
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38291
		heightTempGrad  0.625
		beachWidth      0.0010746
		tropicWidth     0.07
		mainFreq        1.7248
		venusFreq       1.5573
		venusMagn       0.64885
		mareFreq        2
		mareDensity     0.38168
		terraceProb     0.12386
		erosion         1
		montesMagn      0.2
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.033503
		dunesFreq       31.842
		dunesFraction   0.79863
		hillsMagn       2
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      56.947
		riversFreq      3.9257
		riversSin       6.9528
		riftsMagn       56.929
		riftsFreq       2.0742
		riftsSin        6.2557
		eqridgeMagn     0.49618
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  6.2595
		canyonsMagn     0.46607
		canyonsFreq     1.2077
		canyonsFraction 0.53238
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   0
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.38168
		volcanoFreq     0.94656
		volcanoDensity  0.1374
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      19.123
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           0.74809
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          100
		Density         7.3252e-06
		Pressure        1e-06
		Greenhouse      0.00011447
		Bright          0.2
		Opacity         1
		SkyLight        0.33333
		Hue             -0.01
		Saturation      1.3

		Composition
		{
			Ne        	99.419
			N2        	0.58036
			Ar        	0.00040409
			CO        	1.0662e-05
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          2.72897087
		SemiMajorAxis   1.6
		Eccentricity    0.0152671756
		Inclination     0.1
		AscendingNode   -35.7251908
		ArgOfPericenter -57.7099237
		MeanAnomaly     30
	}
}
s
