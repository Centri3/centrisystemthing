Planet	"Ol/Caecus V"
{
	ParentBody     "Oblitus es"
	Class          "Aquaria"
	Mass            2.07
	Radius          8.21e+03
	InertiaMoment   0.331
	Oblateness      0.0105
	RotationPeriod  13.7
	RotationEpoch   1451545
	Obliquity       69.5
	EqAscendNode    46.8

	EndogenousHeating 0
	AlbedoBond      0.07
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Interior
	{
		Composition
		{
			Ices		0.01
			Silicates	77.8
			Metals		2.2
		}
	}

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.866
		Randomize      (-0.697, -0.939, -0.691)
		colorDistMagn   0.0606
		colorDistFreq   1.14e+03
		detailScale     3.28e+04
		drivenDarkening 0
		seaLevel        0.261
		snowLevel       2
		tropicLatitude  0.933
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.229
		heightTempGrad  0.625
		beachWidth      0.000593
		tropicWidth     0.07
		mainFreq        1.67
		venusFreq       1.33
		venusMagn       0
		mareFreq        2.01
		mareDensity     0
		terraceProb     0.449
		erosion         0
		montesMagn      0.229
		montesFreq      451
		montesSpiky     0.877
		montesFraction  0.563
		dunesMagn       0.0458
		dunesFreq       80.6
		dunesFraction   0.847
		hillsMagn       0.129
		hillsFreq       896
		hillsFraction   0.23
		hills2Fraction  0.0316
		riversMagn      0
		riversFreq      3.23
		riversSin       6.52
		riftsMagn       0
		riftsFreq       1.88
		riftsSin        7.64
		canyonsMagn     0.393
		canyonsFreq     2.12
		canyonsFraction 0
		cracksMagn      0.0242
		cracksFreq      3.46
		cracksOctaves   4
		craterMagn      0.56
		craterFreq      21.3
		craterDensity   0.935
		craterOctaves   22
		craterRayedFactor 0.0571
		volcanoMagn     0.661
		volcanoFreq     0.617
		volcanoDensity  0.175
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.278
		volcanoRadius   0.587
		volcanoTemp     359
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      17.9
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
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
		Height          53.7
		Density         1.05e-07
		Pressure        9.3e-09
		Greenhouse      0.00039
		Bright          0.5
		Opacity         0
		SkyLight        0.167
		Hue             0
		Saturation      1

		Composition
		{
			He        	100
		}
	}

	Climate
	{
		GlobalWindSpeed  0
	}

	Aurora
	{
		Height         8.81
		NorthLat       79.3
		NorthLon       -140
		NorthRadius    2.09e+03
		NorthWidth     543
		NorthRings     5
		NorthBright    0.498
		NorthFlashFreq 72.8
		NorthMoveSpeed 0.783
		NorthParticles 50000
		SouthLat       -90
		SouthLon       13.6
		SouthRadius    890
		SouthWidth     283
		SouthRings     4
		SouthBright    0.498
		SouthFlashFreq 76.2
		SouthMoveSpeed 0.971
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          579.968814
		SemiMajorAxis   56.9803603
		Eccentricity    0.320610687
		Inclination     8.24427481
		AscendingNode   -107.175573
		ArgOfPericenter -200.610687
		MeanAnomaly     112.671756
	}
}

